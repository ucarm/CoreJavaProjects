
public class switchCase {

	public static void main(String[] args) {

		int day =1;
		String name="";
		switch(day) {
			case 0:
				name+= "Sunday"; break;
			case 1:
				name+= "Monday"; break;
			case 2:
				name+= "Tuesday"; break;
			case 3:
				name+= "Wednesday"; break;
			case 4:
				name+= "Thursday"; break;
			case 5:
				name+= "Friday"; break;
			case 6:
				name+= "Saturday"; break;
		}
		System.out.println("Day is: "+name);
	}

}
