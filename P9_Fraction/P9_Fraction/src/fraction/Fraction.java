package fraction;

public class Fraction {
	//2. Create a private instance variable numerator of type int;
	// 3. Create a private instance variable denominator of type int;
	private int numerator;
	private int denominator;
	
	//  4. Add a public instance setter method "void setNum(int n)", which sets the value of numerator to n.
	public void setNum(int n) {
		numerator=n;
	}
	//  5. Add a public instance method "int getNum" that returns the value of numerator;
	public int getNum() {
		return numerator;
	}
	//   6. Add a public instance setter method "void setDen(int d)", which sets the value of denominator to d.
	public void setDen(int d ) {
		denominator= d;
	}
	//  7. Add a public instance method "int getDen" that returns the value of denominator;
	public int getDen() {
		return denominator;
	}
	//   8. Add a constructor that takes no argument, and sets numerator to 0, and sets denominator to 1.
	
	public Fraction() {
		numerator=0;
		denominator =1;
	}
	//   9. Add a constructor that takes one int argument n, and sets numerator to n, sets denominator to 1.

	public Fraction(int n) {
		numerator=n;
		denominator =1;
	}
	
	//  10. Add a constructor that takes two int arguments n and d, and sets numerator to n, sets denominator to d.
	public Fraction(int n, int d) {
		numerator=n;
		denominator =d;
	}
	
	public String toString(){
		if (numerator==0)
			return "0";
		else if(denominator ==1) {
			return ""+numerator;
		}
		return numerator+"/"+denominator;
	}
	
	
	
	
}