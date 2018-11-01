
public class switchCase {
	
private static String name="";
private static int day =1;

	public static void main(String[] args) {
		chooseDay(day);
	}
	private static void chooseDay(int num) {
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
			default: 
				name+="Friday";
		}
		System.out.println("Day is: "+name);
	}

}
