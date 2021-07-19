package encapsulation;

public class ATM {
	private int pinNum=12345;
	int accNum=345667;
	int balance=100000;

	public void withdraw(int pin, int amount) {
		if(pin==pinNum) {
			System.out.println("Enter the amount= "+amount);
			balance=balance-amount;
			System.out.println("Remaining balance in your account= "+balance);
		}else {
			System.out.println("Invalid Pin");
		}
	
	}
	public void changePin(int otp, int accountNo, int newPin) {
		if(otp==12345 && accountNo==accNum) {
			pinNum=newPin;
		}else {
			System.out.println("User is not Authentic");
		}
	}
	
}
