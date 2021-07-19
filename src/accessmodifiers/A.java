package accessmodifiers;

public class A {

	private int x=10;
	String str="Name"; //default access modifier
	protected double f= 25.2;
	public char c='A';
	
	public void output() {
		System.out.println(x);
		System.out.println(str);
		System.out.println(f);
		System.out.println(c);
	}
}

