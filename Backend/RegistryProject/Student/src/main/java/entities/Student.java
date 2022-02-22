package entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data

@Document(collection = "student")
public class Student {
	@Id
	private String registrationNumber;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private String email;
	private String telNr;
	private String studyCourse;
	private String subgroup;
	private int semester;

	public Student(String registrationNumber, String firstName, String lastName, String gender, int age,
			String email, String telNr, String studyCourse, String subgroup, int semester) {
		super();
		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.telNr = telNr;
		this.studyCourse = studyCourse;
		this.subgroup = subgroup;
		this.semester = semester;
	}

	public Student() {
		super();
	}

}
