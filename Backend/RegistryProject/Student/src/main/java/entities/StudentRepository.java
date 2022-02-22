package entities;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
	Student findByRegistrationNumber(String registrationNumber);
	Student findByFirstName(String firstName);
	Student findByLastName(String lastName);
	List<Student> findBySemester(int semester);

}
