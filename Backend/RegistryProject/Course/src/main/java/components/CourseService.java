package components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Course;
import entities.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;

	public void createCourse(Course course) {
		repository.save(course);
	}

	public void createCourse(String courseId, String subject, String shortSubject, int ECTS, int semester,
			List<String> professorList) {
		Course course = new Course(courseId, subject, shortSubject, ECTS, semester, professorList);
		repository.save(course);
	}

	public List<Course> readCourses() {
		List<Course> list = repository.findAll();
		return list;
	}

	public Course findByCourseId(String courseId) {
		Course course = repository.findByCourseId(courseId);
		return course;
	}

	public List<Course> findBySemester(int semester) {
		List<Course> list = repository.findBySemester(semester);
		return list;
	}

	public void updateCourse(Course originalCourse, Course updatedCourse) {
		originalCourse = updatedCourse;
		/*
		 * originalCourse.setCourseId(updatedCourse.getCourseId());
		 * originalCourse.setSubject(updatedCourse.getSubject());
		 * originalCourse.setECTS(updatedCourse.getECTS());
		 * originalCourse.setProfessorList(updatedCourse.getProfessorList());
		 * originalCourse.setProfessorList(updatedCourse.getProfessorList());
		 */
		repository.save(originalCourse);
	}

	public void deleteCourse(Course course) {
		repository.delete(course);
	}

	public long countCourses() {
		return repository.count();
	}
}
