package exceptionHandlingExamples;

public class ArithemeticExceptionExample {

	
	public static void main(String[] args) {
	
		int x=50;
		try {
		System.out.println(x/0);
			
		}catch(ArithmeticException a) {
			System.out.println("undefined division");
		}
	}

}
