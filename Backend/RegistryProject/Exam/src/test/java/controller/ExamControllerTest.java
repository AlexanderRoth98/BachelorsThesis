//package controller;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import entities.Exam;
//import entities.ExamRepository;
//
//public class ExamControllerTest extends AbstractTest {
//
//	@Autowired
//	ExamRepository examRepository;;
//
//	@Override
//	@Before
//	public void setUp() {
//		super.setUp();
//	}
//
//	@Test
//	public void controllerTest() throws Exception {
////		createExam();
////		updateExam();
////		readExams();
////		deleteExam();
//
//	}
//
//	public void createExam() throws Exception {
//		String uri = "/createExam";
//
//		List<String> studentList = new ArrayList<String>();
//		studentList.add("201672");
//		studentList.add("2222222");
//
//		List<String> professorList = new ArrayList<String>();
//		professorList.add("22222");
//		professorList.add("222444");
//
//		LocalDateTime start = LocalDateTime.now();
//		LocalDateTime end = LocalDateTime.now();
//
//		Exam exam = new Exam("12", start, end, "PII7", 40, 0, "2255", studentList, professorList);
//
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri).content(mapToJson(exam))
//				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();
//
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200, status);
//
//		String content = mvcResult.getResponse().getContentAsString();
//		System.out.println(content);
//
//	}
//
//	public void updateExam() throws Exception {
//		String uri = "/updateExam{examId}";
//
//		List<String> studentList = new ArrayList<String>();
//		studentList.add("201672");
//		studentList.add("updated");
//
//		List<String> professorList = new ArrayList<String>();
//		professorList.add("updated");
//		professorList.add("222444");
//
//		LocalDateTime start = LocalDateTime.now();
//		LocalDateTime end = LocalDateTime.now();
//
//		Exam exam = new Exam("12", start, end, "PII7 updated", 40, 0, "2255 updated", studentList, professorList);
//
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri, "12").content(mapToJson(exam))
//				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andReturn();
//
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200, status);
//
//		String content = mvcResult.getResponse().getContentAsString();
//		System.out.println(content);
//	}
//
//	public void readExams() throws Exception {
//		String uri = "/readExams";
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
//				.andReturn();
//
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200, status);
//
//		String content = mvcResult.getResponse().getContentAsString();
//		Exam[] examList = super.mapFromJson(content, Exam[].class);
//
//		System.out.println("List content:");
//		for (Exam exam : examList)
//			System.out.println(exam.toString());
//
//		assertTrue(examList.length > 0);
//	}
//
//	public void deleteExam() throws Exception {
//		String uri = "/deleteExam{examId}";
//		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri, "12")).andReturn();
//		int status = mvcResult.getResponse().getStatus();
//		assertEquals(200, status);
//
//		String content = mvcResult.getResponse().getContentAsString();
//		System.out.println(content);
//
//		List<Exam> list = examRepository.findAll();
//		assertTrue(list.isEmpty());
//	}
//}
