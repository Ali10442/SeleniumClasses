package classesandObjects;

public class Student1 {

	int rollnum;
	String name;

	Student1(int rollNumber, String StudentName){
		//instead of using different arguments in the constructor above, 
		//arguments similar to the initial variables can be used by using 'this.' operator 
		//Example: Student1(int rollnum, String name)
		//this.rollnum;
		//this.name;
	rollnum =rollNumber;
	name =StudentName;
		
	}
	public static void main(String[] args) {

		Student1 s= new Student1 (123, "Mark");
		Student1 s1= new Student1 (234, "Alex");
		
		System.out.println(s.rollnum);
		System.out.println(s.name);
		
		System.out.println(s1.rollnum);
		System.out.println(s1.name);
	}

}
