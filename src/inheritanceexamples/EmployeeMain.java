package inheritanceexamples;

public class EmployeeMain extends EmployeeDetails {

	public void Details() {
		System.out.println("Employee name is "+empName);
	}
	
	public static void main(String[] args) {
		
		EmployeeMain e= new EmployeeMain();
	e.Details();
		System.out.println(e.empID);
		System.out.println(e.location);
	
	}

}
