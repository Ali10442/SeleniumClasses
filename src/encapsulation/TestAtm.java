package encapsulation;

public class TestAtm {

	public static void main(String[] args) {

		ATM atm=new ATM();
		atm.changePin(12344, 345667, 34567);
		atm.withdraw(12345, 2000);
	}

}
