package methodOverloading;

public class Add {
	public int sum(int x, int y) {
			return x+y;
	}

	public double sum(double l, double m) {
		return l+m;
	}
	public static void main(String[] args) {
		Add a=new Add();
	
		System.out.println(a.sum(10, 20));
		System.out.println(a.sum(22.3, 45.2));
	}
}
