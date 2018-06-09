package exam;

import java.util.ArrayList;
import java.util.List;

public class q304 {

	int a1;
	
	static void doPro(int a) {
		a=a*a;
	}
	
	static void doStr(StringBuilder s) {
		s.append(" "+s );
	}
	
	public static void main(String[] args) {
		q304 item= new q304();
		item.a1=11;
		StringBuilder sb= new StringBuilder("Hello");
		Integer i=10;
		doPro(i);
		doStr(sb);
		doPro(item.a1);
		System.out.println(i+" "+sb+" "+ item.a1);
		
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(null);
		System.out.println(a);
		a.remove(0);
		a.remove(null);
		System.out.println(a);
		System.out.println(a.getClass());
	}
}
