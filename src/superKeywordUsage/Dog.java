package superKeywordUsage;

public class Dog extends Animal {
	public void colour() {
		System.out.println("White");
		super.colour();
	}
	

	public static void main(String[] args) {


		Dog d= new Dog();
		d.colour();
	}

}
