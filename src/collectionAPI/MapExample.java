package collectionAPI;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> studentMap=new HashMap<Integer, String>();
		studentMap.put(1234, "John");
		studentMap.put(2334, "Alex");
		studentMap.put(1234,"Ben");
		studentMap.put(3456, "Mike");
		studentMap.put(2345,"Adam");

		System.out.println(studentMap);
		System.out.println(studentMap.get(1234));
		
		studentMap.forEach((k,v)->System.out.println(k+" "+v));
	}

}
