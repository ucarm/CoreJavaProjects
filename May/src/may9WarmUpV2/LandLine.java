package may9WarmUpV2;
import may9WarmUp.*;

public class LandLine extends Phone{

	public LandLine(String brand, int size) {
		super(brand, size);
		// TODO Auto-generated constructor stub
	}
	public LandLine() {
		System.out.println("no arg from landLine");
	}
	public void makeCallFromlandLine() {
		super.makeCall();
		System.out.println("Making call from landLine");
	}
}
