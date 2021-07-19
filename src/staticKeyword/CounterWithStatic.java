package staticKeyword;

public class CounterWithStatic {

	static int count=0;
	CounterWithStatic(){
		count++;
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		CounterWithStatic cs= new CounterWithStatic();
		CounterWithStatic cs1= new CounterWithStatic();
		CounterWithStatic cs2= new CounterWithStatic();
		CounterWithStatic cs3= new CounterWithStatic();

	}

}
