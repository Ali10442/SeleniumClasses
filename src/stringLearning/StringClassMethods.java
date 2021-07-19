package stringLearning;

public class StringClassMethods {

	public static void main(String[] args) {
		String str="Hello    ";
		String str1="Welcome";
		
		System.out.println(str.trim());
		System.out.println(str.charAt(0));
		System.out.println(str.concat(str1));
		System.out.println(str1.endsWith("e"));
		System.out.println(str1.startsWith("w"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.isEmpty());
		

	}

}
