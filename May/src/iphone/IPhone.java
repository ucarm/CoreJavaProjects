package iphone;

public class IPhone {
	final String brand ="apple";
	private final double size;
	public static final String platform ="ios";
	
	public IPhone(double size) {
		this.size= size;
	}
	
	public static void main(String[] args) {
		
		IPhone i1= new IPhone(0.0); 
		System.out.println(IPhone.platform);
		System.out.println(i1.size);
		System.out.println(i1.brand);
//		i1.brand="";
//		i1.size=0.1;
//		i1.platform="";
		
		
	}
	
}
