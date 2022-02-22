package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@RequestMapping(value = "/createStudent")
	public String createStudent(@Valid @RequestBody Student student) {
		service.createStudent(student);
		return "Student " + student.getRegistrationNumber() + " created successfully!";
	}

	@RequestMapping("/readStudents")
	public List<Student> readStudents() {
		List<Student> studentList = service.readStudents();
		return studentList;
	}

	@RequestMapping("/updateStudent{registrationNumber}")
	public String updateStudent(@PathVariable("registrationNumber") String registrationNumber,
			@Valid @RequestBody Student updateStudent) {
		Student originalStudent = service.findByRegistrationNumber(registrationNumber);
		service.updateStudent(originalStudent, updateStudent);
		return "Student " + originalStudent.getRegistrationNumber() + " updated successfully!";

	}

	@RequestMapping("/deleteStudent{registrationNumber}")
	public String deleteStudent(@PathVariable("registrationNumber") String registrationNumber) {
		Student student = service.findByRegistrationNumber(registrationNumber);
		service.deleteStudent(student);
		return "Student " + student.getRegistrationNumber() + " deleted successfully!";
	}

	@RequestMapping("/findByRegistrationNumber{registrationNumber}")
	public Student findStudentById(@PathVariable("registrationNumber") String registrationNumber) {
		Student student = service.findByRegistrationNumber(registrationNumber);
		return student;

	}

	@RequestMapping("/findBySemester{semester}")
	public List<Student> findBySemester(@PathVariable("semester") int semester) {
		List<Student> studentList = service.findBySemester(semester);
		return studentList;
	}

	@RequestMapping("/countStudents")
	public long countStudents() {
		return service.countStudents();
	}
}
