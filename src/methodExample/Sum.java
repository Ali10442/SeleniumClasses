package methodExample;

public class Sum {

	int x=10;
	int y= 20;
	
	public void addition() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {

		Sum s= new Sum ();
		s.addition();
	}

}
