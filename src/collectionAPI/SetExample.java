package collectionAPI;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> st=new HashSet<Integer>();
		st.add(10);
		st.add(20);
		st.add(10);
		st.add(45);
		st.add(23);
		st.add(32);
		
		System.out.println(st);
		System.out.println(st.contains(10));
		for(int i: st) {
			System.out.println(i);
		}

	}

}
