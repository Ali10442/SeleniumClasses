package staticKeyword;

public class Student1 {
	int rollNum;
	String name;
	static String university="TIS";
	
	Student1(int rollNum, String name){
		this.rollNum=rollNum;
		this.name=name;	
		
	}

	public void Display() {
		System.out.println(rollNum+" "+name+" "+university);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(123, "Alex");
		s1.Display();
		Student1 s2=new Student1(234, "Peter");
		s2.Display();
		

	}

}
