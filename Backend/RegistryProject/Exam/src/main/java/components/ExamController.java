package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Exam;

@RestController
public class ExamController {

	@Autowired
	ExamService service;

	@RequestMapping(value = "/createExam")
	public String createExam(@Valid @RequestBody Exam exam) {
		service.createExam(exam);
		return "Exam " + exam.getExamId() + " created successfully!";
	}

	@RequestMapping("/readExams")
	public List<Exam> readExam() {
		List<Exam> examList = service.readExams();
		return examList;
	}

	@RequestMapping("/updateExam{examId}")
	public String updateExam(@PathVariable("examId") String examId, @Valid @RequestBody Exam updatedExam) {
		Exam originalExam = service.findByExamId(examId);
		service.updateExam(originalExam, updatedExam);
		return "Exam " + originalExam.getExamId() + " updated successfully!";

	}

	@RequestMapping("/deleteExam{examId}")
	public String deleteExam(@PathVariable("examId") String examId) {
		Exam exam = service.findByExamId(examId);
		service.deleteExam(exam);
		return "Exam " + exam.getExamId() + " deleted successfully!";
	}

	@RequestMapping("/findExamById{examId}")
	public Exam findExamById(@PathVariable("examId") String examId) {
		Exam exam = service.findByExamId(examId);
		return exam;
	}

	@RequestMapping("/countExams")
	public long countExams() {
		return service.countExams();
	}

}
