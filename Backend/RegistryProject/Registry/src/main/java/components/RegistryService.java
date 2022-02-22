package components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registry.course.client.api.CourseControllerApi;
import com.registry.course.client.model.Course;
import com.registry.exam.client.api.ExamControllerApi;
import com.registry.exam.client.model.Exam;
import com.registry.professor.client.api.ProfessorControllerApi;
import com.registry.professor.client.model.Professor;
import com.registry.student.client.api.StudentControllerApi;
import com.registry.student.client.model.Student;
import com.registry.user.client.api.UserControllerApi;
import com.registry.user.client.model.User;

import wrapper.AgeWrapper;
import wrapper.DocumentsWrapper;
import wrapper.GenderWrapper;
import wrapper.SemesterWrapper;

@Service
public class RegistryService {
	@Autowired
	StudentControllerApi studentApi;

	@Autowired
	ProfessorControllerApi professorApi;

	@Autowired
	CourseControllerApi courseApi;

	@Autowired
	ExamControllerApi examApi;

	@Autowired
	UserControllerApi userApi;

	/**
	 * Student
	 */
	public void createStudent(Student student) {
		studentApi.createStudentUsingPOST(student);
	}

	public List<Student> readStudents() {
		List<Student> list = studentApi.readStudentsUsingGET();
		return list;
	}

	public void updateStudent(String registrationNumber, Student updateStudent) {
		studentApi.updateStudentUsingPUT(registrationNumber, updateStudent);
	}

	public void deleteStudent(String registrationNumber) {
		studentApi.deleteStudentUsingDELETE(registrationNumber);
	}

	public Student findStudentById(String registrationNumber) {
		return studentApi.findStudentByIdUsingGET(registrationNumber);
	}

	/**
	 * Professor
	 */

	public void createProfessor(Professor professor) {
		professorApi.createProfessorUsingPOST(professor);
	}

	public List<Professor> readProfessors() {
		List<Professor> list = professorApi.readProfessorUsingGET();
		return list;
	}

	public void updateProfessor(String professorId, Professor updatedProfessor) {
		professorApi.updateProfessorUsingPUT(professorId, updatedProfessor);
	}

	public void deleteProfessor(String professorId) {
		professorApi.deleteProfessorUsingDELETE(professorId);

	}

	public Professor findProfessorById(String professorId) {
		return professorApi.findProfessorByIdUsingGET(professorId);
	}

	/**
	 * Course
	 */

	public void createCourse(Course course) {
		courseApi.createCourseUsingPOST(course);
	}

	public List<Course> readCourses() {
		List<Course> list = courseApi.readCoursesUsingGET();
		return list;
	}

	public void updateCourse(String courseId, Course updatedCourse) {
		courseApi.updateCourseUsingPUT(courseId, updatedCourse);
	}

	public void deleteCourse(String courseId) {
		courseApi.deleteCourseUsingDELETE(courseId);

	}

	public Course findCourseById(String courseId) {
		return courseApi.findCourseByIdUsingGET(courseId);
	}

	/**
	 * Exam
	 */

	public void createExam(Exam exam) {
		examApi.createExamUsingPOST(exam);
	}

	public List<Exam> readExams() {
		List<Exam> list = examApi.readExamUsingGET();
		return list;
	}

	public void updateExam(String examId, Exam updatedExam) {
		examApi.updateExamUsingPUT(examId, updatedExam);
	}

	public void deleteExam(String examId) {
		examApi.deleteExamUsingDELETE(examId);

	}

	public Exam findExamById(String examId) {
		return examApi.findExamByIdUsingGET(examId);
	}

	/**
	 * Professor add to /get from /remove from Course
	 */

	public void addProfessorToCourse(String professorId, String courseId) {

		Course course = findCourseById(courseId);

		List<String> professorList = course.getProfessorList();
		professorList.add(professorId);
		course.setProfessorList(professorList);

		updateCourse(courseId, course);

	}

	public void removeProfessorFromCourse(String professorId, String courseId) {

		Course course = findCourseById(courseId);

		List<String> professorList = course.getProfessorList();
		professorList.remove(professorId);
		course.setProfessorList(professorList);

		updateCourse(courseId, course);
	}

	public List<Professor> getProfessorsFromCourse(String courseId) {
		Course course = findCourseById(courseId);
		List<String> professorIdList = course.getProfessorList();

		List<Professor> professorObjectList = new ArrayList<Professor>();

		for (String professorId : professorIdList) {
			Professor professor = findProfessorById(professorId);
			professorObjectList.add(professor);

		}

		return professorObjectList;

	}

	/**
	 * Professor add to /get from /remove from Exam
	 */

	public void addProfessorToExam(String professorId, String examId) {

		Exam exam = findExamById(examId);

		exam.setProfessorId(professorId);

		updateExam(examId, exam);

	}

	public void removeProfessorFromExam(String professorId, String examId) {

		Exam exam = findExamById(examId);

		exam.setProfessorId("0");

		updateExam(examId, exam);
	}

	public Professor getProfessorsFromExam(String examId) {

		Exam exam = findExamById(examId);

		String professorId = exam.getProfessorId();

		return findProfessorById(professorId);

	}

	/**
	 * Student add to /get from /remove from Exam
	 */

	public void addStudentToExam(String registrationNumber, String examId) {

		Exam exam = findExamById(examId);

		List<String> studentList = exam.getStudentList();
		if (studentList == null)
			studentList = new ArrayList<>();
		studentList.add(registrationNumber);
		exam.setStudentList(studentList);

		int enrolled = exam.getNumberOfEnrolledStudents();
		enrolled++;
		exam.setNumberOfEnrolledStudents(enrolled);

		updateExam(examId, exam);

	}

	public void removeStudentFromExam(String registrationNumber, String examId) {

		Exam exam = findExamById(examId);

		List<String> studentList = exam.getStudentList();
		studentList.remove(registrationNumber);
		exam.setStudentList(studentList);

		int enrolled = exam.getNumberOfEnrolledStudents();
		enrolled--;
		exam.setNumberOfEnrolledStudents(enrolled);

		updateExam(examId, exam);
	}

	public List<Student> getStudentsFromExam(String examId) {
		Exam exam = findExamById(examId);
		List<String> studentIdList = exam.getStudentList();

		List<Student> studentObjectList = new ArrayList<Student>();

		if (studentIdList != null) {
			for (String registrationNumber : studentIdList) {
				Student student = findStudentById(registrationNumber);
				studentObjectList.add(student);
			}
		}

		return studentObjectList;

	}

	/**
	 * Get Course infromation from Exam
	 */

	public Course getCourseInfromationFromExam(String examId) {
		Exam exam = findExamById(examId);

		String courseId = exam.getCourseId();

		Course course = findCourseById(courseId);

		return course;
	}

	/**
	 * Get Courses depending on semester
	 */

	public List<Course> getCoursesFromSemester(int semester) {
		return courseApi.findCoursesBySemesterUsingGET(semester);
	}

	/**
	 * Get Students depending on semester
	 */

	public List<Student> getStudentsFromSemester(int semester) {
		return studentApi.findBySemesterUsingGET(semester);
	}

	/**
	 * Get all Courses a Professor teaches
	 */

	public List<Course> getCoursesFromProfessor(String professorId) {
		List<Course> allCourses = readCourses();

		List<Course> coursesFromProfessor = new ArrayList<Course>();

		for (Course course : allCourses) {
			List<String> professors = course.getProfessorList();
			for (String id : professors)
				if (id.equals(professorId))
					coursesFromProfessor.add(course);

		}

		return coursesFromProfessor;

	}

	/**
	 * Statistics
	 */

	public GenderWrapper getGenderStatisticsFromStudents() {

		List<Student> list = readStudents();
		int femaleCount = 0;
		int maleCount = 0;

		for (Student student : list) {

			String gender = student.getGender();

			switch (gender) {

			case ("F"):
				femaleCount++;
				break;

			case ("M"):
				maleCount++;
				break;
			}

		}

		return new GenderWrapper(femaleCount, maleCount);
	}

	public GenderWrapper getGenderStatisticsFromProfessors() {

		List<Professor> list = readProfessors();
		int femaleCount = 0;
		int maleCount = 0;

		for (Professor professor : list) {

			String gender = professor.getGender();

			switch (gender) {

			case ("F"):
				femaleCount++;
				break;

			case ("M"):
				maleCount++;
				break;
			}

		}

		return new GenderWrapper(femaleCount, maleCount);
	}

	public SemesterWrapper getSemesterStatisticsFromStudents() {
		List<Student> list = readStudents();

		int sem1 = 0;
		int sem2 = 0;
		int sem3 = 0;
		int sem4 = 0;
		int sem5 = 0;
		int sem6 = 0;

		for (Student student : list) {

			int semester = student.getSemester();

			switch (semester) {

			case (1):
				sem1++;
				break;

			case (2):
				sem2++;
				break;

			case (3):
				sem3++;
				break;

			case (4):
				sem4++;
				break;

			case (5):
				sem5++;
				break;

			case (6):
				sem6++;
				break;

			}

		}

		return new SemesterWrapper(sem1, sem2, sem3, sem4, sem5, sem6);
	}

	public AgeWrapper getAgeStatisticsFromProfessors() {
		int segment1 = 0;
		int segment2 = 0;
		int segment3 = 0;
		int segment4 = 0;
		int segment5 = 0;
		int segment6 = 0;

		List<Professor> list = readProfessors();

		for (Professor professor : list) {
			int age = professor.getAge();

			if (age <= 29)
				segment1++;

			if (age > 29 && age <= 39)
				segment2++;

			if (age > 39 && age <= 49)
				segment3++;

			if (age > 49 && age <= 59)
				segment4++;

			if (age > 59 && age <= 69)
				segment5++;

			if (age > 69)
				segment6++;
		}

		return new AgeWrapper(segment1, segment2, segment3, segment4, segment5, segment6);

	}

	public DocumentsWrapper countAllDocuments() {
		return new DocumentsWrapper(studentApi.countStudentsUsingGET(), professorApi.countProfessorsUsingGET(),
				courseApi.countCoursesUsingGET(), examApi.countExamsUsingGET());

	}

	/**
	 * Login
	 */

	public User grantAccess(String email, String password) {

		if (userApi.findUserByEmailUsingGET(email) == null)
			return null;
		else {
			User user = userApi.findUserByEmailUsingGET(email);

			if (user.getPassword().equals(password))
				return user;
			else
				return null;
		}

	}

	public Student matchUserToStudent(String email) {

		List<Student> list = studentApi.readStudentsUsingGET();

		for (Student student : list)
			if (student.getEmail().equals(email))
				return student;

		return null;

	}

	public Professor matchUserToProfessor(String email) {

		List<Professor> list = professorApi.readProfessorUsingGET();

		for (Professor professor : list)
			if (professor.getEmail().equals(email))
				return professor;

		return null;

	}

	public User createUser(User user) {
		return userApi.createUserUsingPOST(user);
	}

	public List<Exam> getEnrolledExams(String registrationNumber) {

		List<Exam> allExams = examApi.readExamUsingGET();
		List<Exam> enrolledExams = new ArrayList<Exam>();

		for (Exam exam : allExams) {

			List<String> studentList = exam.getStudentList();

			if (studentList == null) {

			} else {

				for (String studentId : studentList) {
					if (studentId.equals(registrationNumber)) {
						enrolledExams.add(exam);
					}

				}
			}
		}
		return enrolledExams;
	}

	public List<Exam> getExamsFromProfessor(String professorId) {

		List<Exam> allExams = examApi.readExamUsingGET();
		List<Exam> profExams = new ArrayList<Exam>();

		for (Exam exam : allExams) {

			if (exam.getProfessorId().equals(professorId)) {
				profExams.add(exam);
			}

		}

		return profExams;
	}

}
