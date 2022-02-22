package wrapper;

import lombok.Data;

@Data
public class DocumentsWrapper {
	long studentCounter;
	long professorCounter;
	long courseCounter;
	long examCounter;

	public DocumentsWrapper(long studentCounter, long professorCounter, long courseCounter, long examCounter) {
		super();
		this.studentCounter = studentCounter;
		this.professorCounter = professorCounter;
		this.courseCounter = courseCounter;
		this.examCounter = examCounter;
	}

	public DocumentsWrapper() {
		super();
	}

}
