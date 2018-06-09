package Practices;

public class question12ch4 {

	public static long square(int x) {
		long y= x* (long)x;
		x=-1;
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=9;
		question12ch4 n= null;;
		long result= n.square(value);
		System.out.println(value+"  "+result);
	}

}
