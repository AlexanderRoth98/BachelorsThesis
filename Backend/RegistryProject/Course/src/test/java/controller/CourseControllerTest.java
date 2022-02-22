package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import entities.Course;
import entities.CourseRepository;

public class CourseControllerTest extends AbstractTest {

	@Autowired
	CourseRepository courseRepository;

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void controllerTest() throws Exception {
		createCourse();
		updateCourse();
		readCourses();
		deleteCourse();

	}

	public void createCourse() throws Exception {
		String uri = "/createCourse";

		List<String> professorList = new ArrayList<String>();
		professorList.add("22222");
		professorList.add("222444");

		Course course = new Course("1110022", "Programare Web","PW", 6, 1, professorList);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).content(mapToJson(course))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

	}

	public void updateCourse() throws Exception {
		String uri = "/updateCourse{courseId}";

		List<String> professorList = new ArrayList<String>();
		professorList.add("22222");
		professorList.add("222444");

		Course course = new Course("1110022", "updated Programare Web","PWWW", 6, 1, professorList);

		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri, "1110022").content(mapToJson(course))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
	}

	public void readCourses() throws Exception {
		String uri = "/readCourses";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		Course[] courseList = super.mapFromJson(content, Course[].class);

		System.out.println("List content:");
		for (Course course : courseList)
			System.out.println(course.toString());

		assertTrue(courseList.length > 0);
	}

	public void deleteCourse() throws Exception {
		String uri = "/deleteCourse{courseId}";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri, "1110022")).andReturn();
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);

		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);

		List<Course> list = courseRepository.findAll();
		assertTrue(list.isEmpty());
	}
}
