package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registry.course.client.model.Course;
import com.registry.exam.client.model.Exam;
import com.registry.professor.client.model.Professor;
import com.registry.student.client.model.Student;
import com.registry.user.client.model.User;

import wrapper.AgeWrapper;
import wrapper.DocumentsWrapper;
import wrapper.GenderWrapper;
import wrapper.SemesterWrapper;

@RestController
public class RegistryController {

	@Autowired
	RegistryService service;

	/**
	 * Student
	 */

	@PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createStudent(@Valid @RequestBody Student student) {
		service.createStudent(student);

	}

	@GetMapping(value = "/students")
	public List<Student> readStudents() {
		List<Student> studentList = service.readStudents();
		return studentList;
	}

	@PutMapping(value = "/students/{registrationNumber}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@PathVariable("registrationNumber") String registrationNumber,
			@Valid @RequestBody Student updateStudent) {
		service.updateStudent(registrationNumber, updateStudent);

	}

	@DeleteMapping(value = "/students/{registrationNumber}")
	public void deleteStudent(@PathVariable("registrationNumber") String registrationNumber) {
		service.deleteStudent(registrationNumber);
	}

	/**
	 * Professor
	 */

	@PostMapping(value = "/professors", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createProfessor(@Valid @RequestBody Professor professor) {
		service.createProfessor(professor);

	}

	@GetMapping(value = "/professors")
	public List<Professor> readProfessors() {
		List<Professor> professorList = service.readProfessors();
		return professorList;
	}

	@PutMapping(value = "/professors/{professorId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateProfessor(@PathVariable("professorId") String professorId,
			@Valid @RequestBody Professor updatedProfessor) {
		service.updateProfessor(professorId, updatedProfessor);

	}

	@DeleteMapping(value = "/professors/{professorId}")
	public void deleteProfessor(@PathVariable("professorId") String professorId) {
		service.deleteProfessor(professorId);
	}

	/**
	 * Course
	 */

	@PostMapping(value = "/courses", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCourse(@Valid @RequestBody Course course) {
		service.createCourse(course);

	}

	@GetMapping(value = "/courses")
	public List<Course> readCourses() {
		List<Course> courseList = service.readCourses();
		return courseList;
	}

	@PutMapping(value = "/courses/{courseId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateCourse(@PathVariable("courseId") String courseId, @Valid @RequestBody Course updatedCourse) {
		service.updateCourse(courseId, updatedCourse);

	}

	@DeleteMapping(value = "/courses/{courseId}")
	public void deleteCourse(@PathVariable("courseId") String courseId) {
		service.deleteCourse(courseId);
	}

	/**
	 * Exam
	 */

	@PostMapping(value = "/exams", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createExam(@Valid @RequestBody Exam exam) {
		service.createExam(exam);

	}

	@GetMapping(value = "/exams")
	public List<Exam> readExams() {
		List<Exam> examList = service.readExams();
		return examList;
	}

	@PutMapping(value = "/exams/{examId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateExam(@PathVariable("examId") String examId, @Valid @RequestBody Exam updatedExam) {
		service.updateExam(examId, updatedExam);

	}

	@DeleteMapping(value = "/exams/{examId}")
	public void deleteExam(@PathVariable("examId") String examId) {
		service.deleteCourse(examId);
	}

	@GetMapping(value = "/exams/{examId}")
	public Exam getExamById(@PathVariable("examId") String examId) {
		return service.findExamById(examId);
	}

	/**
	 * Professor add to /get from /remove from Course
	 */

	@PostMapping(value = "/professors/{professorId}/{courseId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addProfessorToCourse(@PathVariable("professorId") String professorId,
			@PathVariable("courseId") String courseId) {

		service.addProfessorToCourse(professorId, courseId);

		return "Professor " + professorId + " added to course " + courseId + ".";
	}

	@GetMapping(value = "/professors/{courseId}")
	public List<Professor> getProfessorsFromCourse(@PathVariable("courseId") String courseId) {
		List<Professor> professorList = service.getProfessorsFromCourse(courseId);
		return professorList;
	}

	@DeleteMapping(value = "/professors/{professorId}/{courseId}")
	public String removeProfessorFromCourse(@PathVariable("professorId") String professorId,
			@PathVariable("courseId") String courseId) {
		service.removeProfessorFromCourse(professorId, courseId);
		return "Professor " + professorId + " removed from course " + courseId + ".";
	}

	/**
	 * Professor add to /get from /remove from Exam
	 */
	@PostMapping(value = "/professors/{professorId}/{examId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addProfessorToExam(@PathVariable("professorId") String professorId,
			@PathVariable("examId") String examId) {

		service.addProfessorToExam(professorId, examId);

		return "Professor " + professorId + " added to exam " + examId + ".";
	}

	@GetMapping(value = "/professors/{examId}")
	public Professor getProfessorsFromExam(@PathVariable("examId") String examId) {
		Professor professor = service.getProfessorsFromExam(examId);
		return professor;
	}

	@DeleteMapping(value = "/professors/{professorId}/{examId}")
	public String removeProfessorFromExam(@PathVariable("professorId") String professorId,
			@PathVariable("ExamId") String examId) {
		service.removeProfessorFromExam(professorId, examId);
		return "Professor " + professorId + " removed from exam " + examId + ".";
	}

	/**
	 * Student add to /get from /remove from Exam
	 */
	@GetMapping(value = "/students/{registrationNumber}/{examId}")
	public String addStudentToExam(@PathVariable("registrationNumber") String registrationNumber,
			@PathVariable("examId") String examId) {

		service.addStudentToExam(registrationNumber, examId);

		return "Student " + registrationNumber + " added to exam " + examId + ".";
	}

	@GetMapping(value = "/students/exams/{examId}")
	public List<Student> getStudentsFromExam(@PathVariable("examId") String examId) {
		List<Student> studentList = service.getStudentsFromExam(examId);
		return studentList;
	}

	@DeleteMapping(value = "/students/{registrationNumber}/{examId}")
	public String removeStudentFromExam(@PathVariable("registrationNumber") String registrationNumber,
			@PathVariable("examId") String examId) {
		service.removeStudentFromExam(registrationNumber, examId);
		return "Student " + registrationNumber + " removed from exam " + examId + ".";
	}

	/**
	 * Get Course infromation from Exam
	 */

	@GetMapping(value = "/courses/exam/{examId}")
	public Course getCourseInfromationFromExam(@PathVariable("examId") String examId) {

		return service.getCourseInfromationFromExam(examId);
	}

	/**
	 * Get Courses depending on semester
	 */

	@GetMapping(value = "/courses/{semester}")
	public List<Course> getCoursesFromSemester(@PathVariable("semester") String semester) {
		return service.getCoursesFromSemester(Integer.parseInt(semester));

	}

	/**
	 * Get Students depending on semester
	 */
	@GetMapping(value = "/students/{semester}")
	public List<Student> getStudentsFromSemester(@PathVariable("semester") String semester) {
		return service.getStudentsFromSemester(Integer.parseInt(semester));
	}

	/**
	 * Get all Courses a Professor teaches
	 */
	@GetMapping(value = "/courses/professor/{professorId}")
	public List<Course> getCoursesFromProfessor(@PathVariable("professorId") String professorId) {
		return service.getCoursesFromProfessor(professorId);
	}

	/**
	 * Statistics
	 */
	@GetMapping(value = "/students/gender")
	public GenderWrapper getGenderStatisticsFromStudents() {
		return service.getGenderStatisticsFromStudents();
	}

	@GetMapping(value = "/professors/gender")
	public GenderWrapper getGenderStatisticsFromProfessors() {
		return service.getGenderStatisticsFromProfessors();
	}

	@GetMapping(value = "/students/semester")
	public SemesterWrapper getSemesterStatisticsFromStudents() {
		return service.getSemesterStatisticsFromStudents();
	}

	@GetMapping(value = "/professors/age")
	public AgeWrapper getAgeStatisticsFromProfessors() {
		return service.getAgeStatisticsFromProfessors();
	}

	@GetMapping(value = "/documents")
	public DocumentsWrapper countAllDocuments() {
		return service.countAllDocuments();

	}

	/**
	 * login
	 */

	@GetMapping(value = "users/{email}/{password}")
	public User grantAccess(@PathVariable("email") String email, @PathVariable("password") String password) {
		return service.grantAccess(email, password);

	}

	@GetMapping(value = "users/student/{email}")
	public Student matchUserToStudent(@PathVariable("email") String email) {
		return service.matchUserToStudent(email);
	}

	@GetMapping(value = "users/professor/{email}")
	public Professor matchUserToProfessor(@PathVariable("email") String email) {
		return service.matchUserToProfessor(email);
	}

	@PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User createUser(@Valid @RequestBody User user) {
		return service.createUser(user);

	}

	@GetMapping(value = "exams/students/{registrationNumber}")
	public List<Exam> getEnrolledExams(@PathVariable("registrationNumber") String registrationNumber) {
		return service.getEnrolledExams(registrationNumber);
	}

	@GetMapping(value = "exams/professors/{professorId}")
	public List<Exam> getExamsFromProfessor(@PathVariable("professorId") String professorId) {
		return service.getExamsFromProfessor(professorId);
	}

}
