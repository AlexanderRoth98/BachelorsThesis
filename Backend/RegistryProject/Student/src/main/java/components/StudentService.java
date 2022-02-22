package components;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Student;
import entities.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	// Create
	public void createStudent(Student student) {
		repository.save(student);

	}

	public void createStudent(String registrationNumber, String firstName, String lastName, String gender, int age,
			String email, String telNr, String studyCourse, String subgroup, int semester) {
		Student student = new Student(registrationNumber, firstName, lastName, gender, age, email, telNr, studyCourse,
				subgroup, semester);
		repository.save(student);
	}

	// Read
	public List<Student> readStudents() {
		List<Student> list = repository.findAll();
		return list;
	}

	public Optional<Student> findById(String id) {
		Optional<Student> student = repository.findById(id);
		return student;
	}

	// Update
	public void updateStudent(Student originalStudent, Student updatedStudent) {
		originalStudent = updatedStudent;
		/*
		 * originalStudent.setRegistrationNumber(updatedStudent.getRegistrationNumber())
		 * ; originalStudent.setFirstName(updatedStudent.getFirstName());
		 * originalStudent.setLastName(updatedStudent.getLastName());
		 * originalStudent.setEmail(updatedStudent.getEmail()); originalStudent.set
		 * originalStudent.setTelNr(updatedStudent.getTelNr());
		 * originalStudent.setStudyCourse(updatedStudent.getStudyCourse());
		 * originalStudent.setSubgroup(updatedStudent.getSubgroup());
		 * originalStudent.setSemester(updatedStudent.getSemester());
		 */
		repository.save(originalStudent);

	}

	public Student findByRegistrationNumber(String registrationNumber) {
		Student student = repository.findByRegistrationNumber(registrationNumber);
		return student;
	}

	public List<Student> findBySemester(int semester) {
		List<Student> studentList = repository.findBySemester(semester);
		return studentList;
	}

	// Delete
	public void deleteStudent(Student student) {
		repository.delete(student);
	}

	public void deleteAllStudents() {
		repository.deleteAll();
	}

	// Count
	public long countStudents() {
		return repository.count();
	}

}
