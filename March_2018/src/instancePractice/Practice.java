package instancePractice;

public class Practice {
String name;

public String Initial(String name) {
	return name.toUpperCase().substring(0, 1);
}
	
public String FullInitial(String name, String MiddleName, String LastName) {
	String Fullname = name+" "+MiddleName+" "+LastName;
	Fullname = Fullname.toUpperCase();
	String result="";
	result+=Fullname.charAt(0);
	for(int i=0; i<Fullname.length()-1; i++)
	{
		if(Fullname.charAt(i)==' ')
			result+=Fullname.charAt(i+1);
			
	}
	
	return result;
	/// "me uc ra "
}

}
