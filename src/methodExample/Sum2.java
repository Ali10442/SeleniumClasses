package methodExample;

public class Sum2 {
	
	public void Additon (int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		Sum2 s=new Sum2();
		s.Additon(10, 20);
		s.Additon(34, 45);
		s.Additon(45, 50);
		s.Additon(21, 31);
		s.Additon(46, 67);

	}

}
