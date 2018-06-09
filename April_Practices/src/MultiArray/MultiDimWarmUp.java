package MultiArray;

public class MultiDimWarmUp {
	public static void main(String[] args) {
		String[] str = {"Adam", "John", "Tommy", "Jerry", "Kelly"};

		OUTER:

		for (int i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();
			INNER:
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == 'h') {
					System.out.println();
					continue OUTER;
				}
				System.out.print(ch[j] + " ");	
			}
			System.out.println();
		}
		
		
		
	}
}
