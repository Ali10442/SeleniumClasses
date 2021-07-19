package collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//ArrayList arr=new ArrayList();
		List<String> car= new ArrayList<String>();
		car.add("BMW");
		car.add("Benz");
		car.add("BMW");
		car.add("Mercedez");
		
		List<String> car2= new ArrayList<String>();
		car2.add("BMW");
		car2.add("BMW");
		car2.add("Benz");
		car2.add("Mercedez");
		
		System.out.println(car);
		System.out.println(car.get(2));
		System.out.println(car.contains("BMW"));
		System.out.println(car.equals(car2));
		System.out.println(car.containsAll(car2));

	}

}
