package encapsulation;

public class TestStudent {

	public static void main(String[] args) {

		Student st= new Student();
		st.setRollNum(12345);
		System.out.println(st.getRollNum());
		st.setName("Alex");
		System.out.println(st.getName());
	}

}
