package staticKeyword;

public class Counter {

	int count=0;
	
	Counter(){

		
			count++;
			System.out.println(count);
		
	}
	public static void main(String[] args) {

		Counter c=new Counter();
		Counter c2= new Counter();
		Counter c3= new Counter();

	}

}
