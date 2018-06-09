
import java.util.*;

public class FirstJavaProgram {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the temp in F degrees: ");
		double f= scan.nextDouble();
		double c;
		// c= (f-32)*5/9;
		c= (f-32)*5/9;
		System.out.println("in Celcius \t\t\t:"+c);
		c= Math.round(c*100)/100.0;
		System.out.println("in Celcius rounded to 2 decimals :"+c);
	}

}
