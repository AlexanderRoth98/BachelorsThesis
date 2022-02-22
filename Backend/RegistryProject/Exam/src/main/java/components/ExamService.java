package components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Exam;
import entities.ExamRepository;

@Service
public class ExamService {
	@Autowired
	ExamRepository repository;

	public void createExam(Exam exam) {
		repository.save(exam);
	}

	public List<Exam> readExams() {
		List<Exam> list = repository.findAll();
		return list;
	}

	public Exam findByExamId(String examId) {
		Exam exam = repository.findByExamId(examId);
		return exam;
	}

	public void updateExam(Exam originalExam, Exam updatedExam) {

		originalExam.setExamId(updatedExam.getExamId());
		originalExam.setDate(updatedExam.getDate());
		originalExam.setDuration(updatedExam.getDuration());
		originalExam.setClassroom(updatedExam.getClassroom());
		originalExam.setCourseId(updatedExam.getCourseId());
		originalExam.setTotalPlaces(updatedExam.getTotalPlaces());
		originalExam.setNumberOfEnrolledStudents(updatedExam.getNumberOfEnrolledStudents());
		originalExam.setStudentList(updatedExam.getStudentList());
		originalExam.setProfessorId(updatedExam.getProfessorId());
		repository.save(originalExam);
	}

	public void deleteExam(Exam exam) {
		repository.delete(exam);
	}

	public long countExams() {
		return repository.count();
	}
}
