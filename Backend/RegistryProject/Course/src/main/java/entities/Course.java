package entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "course")
public class Course {
	@Id
	private String courseId;
	private String subject;
	private String shortSubject;
	private int ECTS;
	private int semester;
	private List<String> professorList;

	public Course() {
		super();
	}

	public Course(String courseId, String subject, String shortSubject, int ECTS, int semester,
			List<String> professorList) {
		super();
		this.courseId = courseId;
		this.subject = subject;
		this.shortSubject = shortSubject;
		this.ECTS = ECTS;
		this.semester = semester;
		this.professorList = professorList;
	}

}
