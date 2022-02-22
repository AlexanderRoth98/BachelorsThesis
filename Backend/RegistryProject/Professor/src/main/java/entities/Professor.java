package entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

@Document(collection = "professor")
public class Professor {
	@Id
	private String professorId;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String email;
	private String telNr;
	private String title;

	public Professor(String professorId, String firstName, String lastName, String gender, int age, String email,
			String telNr, String title) {
		super();
		this.professorId = professorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.telNr = telNr;
		this.title = title;
	}

	public Professor() {
		super();
	}

}
