package exceptionHandlingExamples;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
	String str = null;
	
	try {
		System.out.println(str.length());
	}
	catch(NullPointerException n) {
		System.out.println("Exception");
	}
	}
}
