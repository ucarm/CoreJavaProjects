package MyStringToolBox;

public class stringStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringToolBox m =new MyStringToolBox("ABC12345");
		int sum = m.calculateSum();
		System.out.println(sum);
		
		m.targetString="ABC13245678cvnjjklsdfjgisfjkl;djkjkl;d";
		System.out.println(m.calculateSum());
		
		System.out.println(m.getList());
	}

}
