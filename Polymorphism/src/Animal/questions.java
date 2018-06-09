package Animal;

public class questions {
	public static void main(String[] args) {
//		Short s1= 200;
//		Integer s2= 400;
//		Long s3 = (long) s1+ s2;
//		String s4= (String) (s2 * s3); 
//		System.out.println(s4);
		float myarray[] = {10.2f, 20.3f, 30.4f, 50.6f};
		int index=0;
		float key=30.4f;
		boolean isFound=false;
		while(index<5)
		{
			if(key==myarray[index])
			{
				isFound=true;
				break;
			}
			index++;
		}
		System.out.println(isFound);
	}
}
