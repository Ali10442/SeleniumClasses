
public class NestedIfExample {

	public static void main(String[] args) {

		int age=4;
		int weight=55;
		
		if (age>=21){
			if(weight>=50)
			{
				System.out.println("Eligible to donate blood");
			}
		}else
		{
			System.out.println("Not eligible to donate blood");
		}
	}

}
