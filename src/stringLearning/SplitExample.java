package stringLearning;

public class SplitExample {

	public static void main(String[] args) {
		String s="I am learning Java";
		String[] strArray=s.split(" ");
		
		for (String str: strArray) {
			System.out.println(str);
		}
		System.out.println("String length is "+strArray.length);

	}

}
