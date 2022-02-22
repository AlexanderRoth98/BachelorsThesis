package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import entities.Professor;
import entities.ProfessorRepository;

public class ProfessorControllerTest extends AbstractTest {

	@Autowired
	ProfessorRepository professorRepository;

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void controllerTest() throws Exception {
		createProfessor();
		updateProfessor();
		readProfessors();
		deleteProfessor();

	}

	public void createProfessor() throws Exception {
		String uri = "/createProfessor";
		Professor professor = new Professor("1111111", "firstName", "lastName", "F", 56, "email", "telNr", "title");
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).content(mapToJson(professor))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

	}

	public void updateProfessor() throws Exception {
		String uri = "/updateProfessor{registrationNumber}";
		Professor professor = new Professor("1111111", "updatedFirstName", "updatedLastName", "updatedGender", 22,
				"updatedEmail", "updatedTelNr", "updatedTitle");
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri, "1111111").content(mapToJson(professor))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
	}

	public void readProfessors() throws Exception {
		String uri = "/readProfessors";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		Professor[] professorList = super.mapFromJson(content, Professor[].class);

		System.out.println("List content:");
		for (Professor prof : professorList)
			System.out.println(prof.toString());

		assertTrue(professorList.length > 0);
	}

	public void deleteProfessor() throws Exception {
		String uri = "/deleteProfessor{registrationNumber}";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri, "1111111")).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

		List<Professor> list = professorRepository.findAll();
		assertTrue(list.isEmpty());
	}
}
