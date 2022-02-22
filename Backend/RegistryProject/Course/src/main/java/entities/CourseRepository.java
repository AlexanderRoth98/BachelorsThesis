package entities;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
	Course findByCourseId(String courseId);
	Course findBySubject(String subject);
	List<Course> findBySemester(int semester);
}
