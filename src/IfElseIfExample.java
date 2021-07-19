import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
				System.out.println("Enter marks");
				int marks= scan.nextInt();
				
		if(marks<50 && marks>=0) {
			System.out.println("Fail");
		}else if(marks>=90 && marks<=100) {
			System.out.println("A+");
		}else if(marks>=80 && marks<90) {
			System.out.println("A");
		}else if(marks>=70 && marks<80) {
			System.out.println("B");
		}else if (marks>=60 && marks<50) {
			System.out.println("C");
	}else if (marks>=50 && marks <60) {
		System.out.println("D");
	}else {
		System.out.println("Invalid marks");
	}
	}	
}
