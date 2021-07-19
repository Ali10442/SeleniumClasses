package interfaceExample;

public class A4 implements Printable, Showable {

	public static void main(String[] args) {
		A4 a= new A4();
		a.print();
		a.show();

	}

	@Override
	public void print() {
		System.out.println("Abstract class");
		
	}

	@Override
	public void show() {
		System.out.println("Abstract class 2");
		
	}

}
