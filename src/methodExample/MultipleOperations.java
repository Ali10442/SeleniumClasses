package methodExample;

public class MultipleOperations {

	public int operations(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {

		MultipleOperations m= new MultipleOperations();
		
		System.out.println(m.operations(10, 30)*10);
		System.out.println(m.operations(24, 2)/2);
		System.out.println(m.operations(44, 55)-40);
		
	}

}
