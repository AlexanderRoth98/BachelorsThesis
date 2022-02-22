package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Professor;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService service;

	@RequestMapping("/createProfessor")
	public String createProfessor(@Valid @RequestBody Professor professor) {
		service.createProfessor(professor);
		return "Professor " + professor.getProfessorId() + " created successfully!";
	}

	@RequestMapping("/readProfessors")
	public List<Professor> readProfessor() {
		List<Professor> professorList = service.readProfessors();
		return professorList;
	}

	@RequestMapping("/updateProfessor{professorId}")
	public String updateProfessor(@PathVariable("professorId") String professorId,
			@Valid @RequestBody Professor updatedProfessor) {

		Professor originalProfessor = service.findByProfessorId(professorId);
		service.updateProfessor(originalProfessor, updatedProfessor);
		return "Professor " + originalProfessor.getProfessorId() + "updated successfully!";
	}

	@RequestMapping("/deleteProfessor{professorId}")
	public String deleteProfessor(@PathVariable("professorId") String professorId) {
		Professor professor = service.findByProfessorId(professorId);
		service.deleteProfessor(professor);
		return "Professor " + professor.getProfessorId() + " deleted successfully!";
	}

	@RequestMapping("/findProfessorById{professorId}")
	public Professor findProfessorById(@PathVariable("professorId") String professorId) {
		Professor professor = service.findByProfessorId(professorId);
		return professor;
	}

	@RequestMapping("/countProfessors")
	public long countProfessors() {
		return service.countProfessors();
	}
}
