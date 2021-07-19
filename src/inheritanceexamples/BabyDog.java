package inheritanceexamples;

public class BabyDog extends Dog {
	
	BabyDog(){
		System.out.println("Inside BabyDog Constrcutor");
	}
	public void activity() {
		System.out.println("Running");
	}

	public void colour() {
		System.out.println("Black and White");
	}
}
