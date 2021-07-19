package stringLearning;

public class StringExample {

	public static void main(String[] args) {
		//3 ways of declaring String

		//1st way-String literals
		/*more memory efficient
		 * if similar contents are assigned to the variables then they share a common memory
		 */
		String str="Hello";
		String str2= "Hello";
		
		//2nd way
		String str1=new String("hello");
		
		
		//3rd way
		char[]  ch= {'h', 'e', 'l', 'l', 'o'};
		String str3= new String(ch);
		System.out.println(str3);
		
		System.out.println(str==str1);//comparing the objects
		System.out.println(str.equals(str1));//comparing the content
		System.out.println(str.equalsIgnoreCase(str1));//comparing the content
		System.out.println(str==str2);//comparing the content
	}

}
