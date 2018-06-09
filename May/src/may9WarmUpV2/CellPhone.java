package may9WarmUpV2;
import may9WarmUp.*;

public class CellPhone extends Phone{

	public CellPhone(String brand, int size) {
		super(brand, size);
		System.out.println("2 arg-CellPhone- ");
		// TODO Auto-generated constructor stub
	}
	
	public CellPhone() {
		System.out.println("no arg from Cellphone");
	}
	public void makeCallFromCellPhone() {
		super.makeCall();
		System.out.println("Making call from CellPhone");
	}

}
