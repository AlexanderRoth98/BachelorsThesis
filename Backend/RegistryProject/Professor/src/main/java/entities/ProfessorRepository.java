package entities;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfessorRepository extends MongoRepository<Professor, String> {
	Professor findByProfessorId(String professorId);
	Professor findByFirstName(String firstName);

}
