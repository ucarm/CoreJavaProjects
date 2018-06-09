import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your grade(0-100) : ");
		int grade = scan.nextInt();
		char letter= ' ';
		switch (grade/10) {
			case 10:
			case 9:
				letter= 'A'; break;
			case 8:
				letter= 'B'; break;
			case 7:
				letter= 'C'; break;
			case 6:
				letter= 'D'; break;
			default:
				letter= 'F';
			
		}
		
		System.out.println("You have : "+letter);
		
	}

}
