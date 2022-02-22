package components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Professor;
import entities.ProfessorRepository;

@Service
public class ProfessorService {
	@Autowired
	ProfessorRepository repository;

	// Create
	public void createProfessor(Professor professor) {
		repository.save(professor);
	}

	public void createProfessor(String professorId, String firstName, String lastName, String gender, int age,
			String email, String telNr, String title) {
		Professor professor = new Professor(professorId, firstName, lastName, gender, age, email, telNr, title);
		repository.save(professor);
	}

	// Read
	public List<Professor> readProfessors() {
		List<Professor> list = repository.findAll();
		return list;
	}

	public Professor findByProfessorId(String professorId) {
		Professor professor = repository.findByProfessorId(professorId);
		return professor;
	}

	public Professor findByFirstName(String firstName) {
		Professor professor = repository.findByFirstName(firstName);
		return professor;
	}

	// Update
	public void updateProfessor(Professor originalProfessor, Professor updatedProfessor) {
		originalProfessor = updatedProfessor;
		/*
		 * originalProfessor.setProfessorId(updatedProfessor.getProfessorId());
		 * originalProfessor.setFirstName(updatedProfessor.getFirstName());
		 * originalProfessor.setLastName(updatedProfessor.getLastName());
		 * originalProfessor.setEmail(updatedProfessor.getEmail());
		 * originalProfessor.setTelNr(updatedProfessor.getTelNr());
		 * originalProfessor.setTitle(updatedProfessor.getTitle());
		 */

		repository.save(originalProfessor);

	}

	// Delete
	public void deleteProfessor(Professor professor) {
		repository.delete(professor);
	}

	public void deleteAllProfessors() {
		repository.deleteAll();
	}

	// Count
	public long countProfessors() {
		return repository.count();
	}
}
