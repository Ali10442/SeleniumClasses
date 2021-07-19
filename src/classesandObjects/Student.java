package classesandObjects;

public class Student {

	int rollnum;
	String name;
	public static void main(String[] args) {

		Student s= new Student();
		Student s1= new Student();
		
		s.rollnum= 123;
		s.name= "Mark";
		
		s1.rollnum=234;
		s1.name="Alex";
		
		System.out.println(s.rollnum+ " " +s.name);
		//System.out.println(s.name);
		System.out.println(s1.rollnum+ " "+s1.name);
		//System.out.println(s1.name);
	}

}
