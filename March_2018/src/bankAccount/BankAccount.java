package bankAccount;

public class BankAccount {
	
		//Location :
		//
	
		//access modifiers : 
		/*
		 * public,private, default, protected
		 * public == accessible anywhere
		 * private == only accessible in the same class
		 * default== no access modifier== it's only accessible in same package== Package private
		 * protected == will learn later
		 * 
		 */
		private int accountNumber;
		private int pin;
		
		void printSomething() {
			System.out.println("Just a print from bank account");
		}
		
		///getter and setter methods
		
		public int getAccountNumber() {
			//all type of complicated validation going on here
			return accountNumber;
			
		}
		
		public void setAccountNumber(int newNumber) {
			accountNumber= newNumber;
		}
		
		public int getPin() {
			return pin;
		}
		
		public void setPin(int newPin) {
			pin= newPin;
		}
		
}
