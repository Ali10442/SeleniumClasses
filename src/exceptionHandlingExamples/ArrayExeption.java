package exceptionHandlingExamples;

public class ArrayExeption {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		
		try {
		System.out.println(arr[5]);

	}catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("do not terminate here");
	}
		System.out.println("Line 1");
	}
}
