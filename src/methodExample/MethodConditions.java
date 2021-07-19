package methodExample;

public class MethodConditions {

	public void findEvenOdd(int num) {
		if (num%2==0) {
			System.out.println("Even number");
	}
	else{
		System.out.println("Odd number");
	}
}
	public static void main(String[] args) {

		MethodConditions me=new MethodConditions();
		me.findEvenOdd(10);
		
	}

}
