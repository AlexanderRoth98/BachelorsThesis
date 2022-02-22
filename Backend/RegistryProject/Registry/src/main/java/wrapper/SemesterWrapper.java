package wrapper;

import lombok.Data;

@Data
public class SemesterWrapper {

	private int sem1;
	private int sem2;
	private int sem3;
	private int sem4;
	private int sem5;
	private int sem6;

	public SemesterWrapper(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6) {
		super();
		this.sem1 = sem1;
		this.sem2 = sem2;
		this.sem3 = sem3;
		this.sem4 = sem4;
		this.sem5 = sem5;
		this.sem6 = sem6;
	}

	public SemesterWrapper() {
		super();
	}

}
