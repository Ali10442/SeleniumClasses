package abstraction;

public class Bike extends Vehicle {

	
	void run() {
		System.out.println("Running the bike");
		
	}

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
	}
}
