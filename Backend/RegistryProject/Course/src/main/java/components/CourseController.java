package components;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Course;

@RestController
public class CourseController {

	@Autowired
	CourseService service;

	@RequestMapping(value = "/createCourse")
	public String createCourse(@Valid @RequestBody Course course) {
		service.createCourse(course);
		return "Course " + course.getCourseId() + " created successfully!";
	}

	@RequestMapping("/readCourses")
	public List<Course> readCourses() {
		List<Course> courseList = service.readCourses();
		return courseList;
	}

	@RequestMapping("/updateCourse{courseId}")
	public String updateCourse(@PathVariable("courseId") String courseId, @Valid @RequestBody Course updatedCourse) {
		Course originalCourse = service.findByCourseId(courseId);
		service.updateCourse(originalCourse, updatedCourse);
		return "Course " + originalCourse.getCourseId() + " updated successfully!";

	}

	@RequestMapping("/deleteCourse{courseId}")
	public String deleteCourse(@PathVariable("courseId") String courseId) {
		Course course = service.findByCourseId(courseId);
		service.deleteCourse(course);
		return "Course " + course.getCourseId() + " deleted successfully!";
	}

	@RequestMapping("/findCourseById{courseId}")
	public Course findCourseById(@PathVariable("courseId") String courseId) {
		Course course = service.findByCourseId(courseId);
		return course;
	}

	@RequestMapping("/findCoursesBySemester{semester}")
	public List<Course> findCoursesBySemester(@PathVariable("semester") int semester) {
		List<Course> courseList = service.findBySemester(semester);
		return courseList;
	}

	@RequestMapping("/countCourses")
	public long countCourses() {
		return service.countCourses();
	}

}
