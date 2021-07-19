
public class SwitchExample2 {

	public static void main(String[] args) {

		char ch= 'A';
		int i=2;
		
		switch (ch) {
		case 'a': System.out.println("a");
		break;
		case 'A': System.out.println("A");
		if (i<=6) {

			System.out.println(i);
			i++;
		}
		break;
		case 'e': System.out.println("e");
		break;
		case 'E': System.out.println("E");
		break;
		case 'i':System.out.println("o");
		break;
		case 'I':System.out.println("o");
		break;
		case 'o':System.out.println("o");
		break;
		case 'O':System.out.println("o");
		break;
		case 'u':System.out.println("o");
		break;
		case 'U':System.out.println("o");
		break;
		default: System.out.println("Consonant");

		}
	}

}
