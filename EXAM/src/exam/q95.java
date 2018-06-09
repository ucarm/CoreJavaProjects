package exam;

public class q95 {

	public static void main(String[] args) {
		String str= "Hello everyone";
		System.out.println(str.replace('e', 'X'));
		StringBuilder sb= new StringBuilder(str);
		System.out.println(sb);
		sb.delete(1,str.length());
		System.out.println(sb);
		int[] arr = new int[1];
		arr[0]=10;
		System.out.println(arr[0]);
		m(arr);
		System.out.println(arr[0]);
		k(arr[0]);

		System.out.println(arr[0]);
		
		sum(10.0,20.0);
		
	}
	static void m(int[] a) {
		a[0] +=5;
	}
	static void k(int m) {
		m+=1;
	}
	
	static void sum(float a, float b) {
		System.out.println("Float sum "+a+b);
	}

	static void sum(double a, double b) {
		System.out.println("Double sum "+(a+b));
	}
}
