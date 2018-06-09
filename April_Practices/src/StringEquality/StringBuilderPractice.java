package StringEquality;

public class StringBuilderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="ABCD12312ADF123ADFF12CCBB321";
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<word.length(); i++) {
			if(word.toUpperCase().charAt(i)=='A' || word.toUpperCase().charAt(i)=='B' || word.toUpperCase().charAt(i)=='C')
			sb.append(word.charAt(i));
		}
			
		sb.replace(4, 7, "ZZZ");
		
		System.out.println(sb);
		
	}

}
