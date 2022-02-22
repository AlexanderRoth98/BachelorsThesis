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

import entities.Student;
import entities.StudentRepository;

public class StudentControllerTest extends AbstractTest {

	@Autowired
	StudentRepository studentRepository;

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void controllerTest() throws Exception {
		createStudent();
		updateStudent();
		readStudents();
		deleteStudent();
	}

	public void createStudent() throws Exception {
		String uri = "/createStudent";
		Student student = new Student("201672", "Alexander", "Roth", "M", 22, "alexander.roth@student.unitbv.ro",
				"0732281785", "10LF172", "IAG", 3);
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).content(mapToJson(student))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

	}

	public void updateStudent() throws Exception {
		String uri = "/updateStudent{registrationNumber}";
		Student student = new Student("201672", "UpdatedAlexander", "UpdatedRoth", "updateM", 89,
				"alexander.roth@student.unitbv.ro", "0732281785", "updatedSubgroup", "IAG", 3);
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri, "201672").content(mapToJson(student))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
	}

	public void readStudents() throws Exception {
		String uri = "/readStudents";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		Student[] studentList = super.mapFromJson(content, Student[].class);

		System.out.println("List content:");
		for (Student std : studentList)
			System.out.println(std.toString());

		assertTrue(studentList.length > 0);
	}

	public void deleteStudent() throws Exception {
		String uri = "/deleteStudent{registrationNumber}";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri, "201672")).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

		List<Student> list = studentRepository.findAll();
		assertTrue(list.isEmpty());
	}
}
