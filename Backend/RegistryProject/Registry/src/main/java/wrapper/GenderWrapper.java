package wrapper;

import lombok.Data;

@Data
public class GenderWrapper {
	private int femaleCount;
	private int maleCount;

	public GenderWrapper(int femaleCount, int maleCount) {
		super();
		this.femaleCount = femaleCount;
		this.maleCount = maleCount;
		
	}

	public GenderWrapper() {
		super();
	}

}
