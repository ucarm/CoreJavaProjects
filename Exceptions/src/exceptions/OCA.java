// OCA EXCEPTION :)

package exceptions;

public class OCA {
	public static void main(String[] args){
		// put your grade here	
		
		int OCAGrade=99;
			
			try {
				if(OCAGrade>=65)
					throw new OCA_Exception(OCAGrade);
				else
					throw new OCA_Exception();
			}
			
			catch(OCA_Exception e){
				System.out.println("OCA is tricky.");
			}
			
	}
}


class OCA_Exception extends Exception{
	public OCA_Exception() {
		System.out.println("Sorry. You failed");
	}
	public OCA_Exception(int Grade) {
		if (Grade>90)
			System.out.println("You passed with the grede of "+Grade+
					".You are hired by Oracle in India");
		else if(Grade>=65)
			System.out.println("Still passing");
	
	}
}
