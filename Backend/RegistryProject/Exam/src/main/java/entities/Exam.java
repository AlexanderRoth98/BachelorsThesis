package entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "exam")
public class Exam {

	@Id
	private String examId;
	private String date;
	private String duration;
	private String classroom;
	private int totalPlaces;
	private int numberOfEnrolledStudents;
	private String courseId;
	private List<String> studentList;
	private String professorId;

	public Exam() {
		super();
	}

	public Exam(String examId, String date, String duration, String classroom, int totalPlaces,
			int numberOfEnrolledStudents, String courseId, List<String> studentList, String professorId) {
		super();
		this.examId = examId;
		this.date = date;
		this.duration = duration;
		this.classroom = classroom;
		this.totalPlaces = totalPlaces;
		this.numberOfEnrolledStudents = numberOfEnrolledStudents;
		this.courseId = courseId;
		this.studentList = studentList;
		this.professorId = professorId;
	}

	

	
	

}
