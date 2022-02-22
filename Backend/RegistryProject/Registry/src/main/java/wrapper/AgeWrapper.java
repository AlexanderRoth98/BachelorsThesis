package wrapper;
import lombok.Data;

@Data
public class AgeWrapper {
	private int segment1;
	private int segment2;
	private int segment3;
	private int segment4;
	private int segment5;
	private int segment6;
	public AgeWrapper(int segment1, int segment2, int segment3, int segment4, int segment5, int segment6) {
		super();
		this.segment1 = segment1;
		this.segment2 = segment2;
		this.segment3 = segment3;
		this.segment4 = segment4;
		this.segment5 = segment5;
		this.segment6 = segment6;
	}
	public AgeWrapper() {
		super();
	}
	
	

}
