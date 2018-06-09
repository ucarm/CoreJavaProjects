package testsWithLoops;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand= new Random();
		Scanner scan= new Scanner(System.in);
		int number = 1+ rand.nextInt(100);
		while(true) {
			System.out.print("Guess a number between 1-100 :");
			int guess= scan.nextInt();
				if(guess==number) {
						System.out.println("Good Job.");
						break;
				}
				else if(guess>number)
						System.out.println("Too high.");
				else
					System.out.println("Too low.");
		}
	}

}
