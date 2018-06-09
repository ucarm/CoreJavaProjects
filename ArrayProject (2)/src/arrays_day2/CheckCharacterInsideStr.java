package arrays_day2;

public class CheckCharacterInsideStr {

	public static void main(String[] args) {
		
		String str = "CyberTek";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='r') {
				System.out.println(" letter r is found at index :"+i);
				break;
			}
		}
		System.out.println(str.indexOf("ABC"));

	}

}
