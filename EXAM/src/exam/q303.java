package exam;

public class q303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs= new String[2];
		int idx = 0;
		System.out.println(strs[idx].length());
		strs[idx].concat(" element "+ idx);
		for (String s : strs) {
			strs[idx].concat(" element "+ idx);
			idx++;
		}
		
		for(idx=0; idx < strs.length; idx++)
			System.out.println(strs[idx]);
	}

}
