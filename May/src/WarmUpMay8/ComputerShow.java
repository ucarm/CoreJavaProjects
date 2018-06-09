package WarmUpMay8;
import WarmUpPart2onMay8.*;
public class ComputerShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mac myMac= new Mac();
		myMac.storage=512;
		myMac.ramType="DDR3";
		myMac.compute();
		myMac.display();
		System.out.println(myMac.storage);
	}

}
