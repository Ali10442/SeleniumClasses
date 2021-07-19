package arrayexamples;

public class Employee {
	
	public static void main(String[] args) {
		//int empSalary[]= new int[5];
		//int[] empSalary= new int[5]; array can be deaclared even in this way
		//	empSalary[0]=23000;
		//empSalary[1]=450000;
		//empSalary[2]=500000;
		//empSalary[3]=500000;
		//empSalary[4]=500000;
		int empSalary[]= {2000, 5000, 4000, 5000, 3000};
		
		for(int s: empSalary) {//enhanced for loop
			System.out.println(s);

			//	int avgSalary= (empSalary[0]+empSalary[1]+empSalary[2]+empSalary[3]+empSalary[4])/5;


		}

		int totalSalary=0;
		for(int i=0; i<empSalary.length;i++) {
			totalSalary=totalSalary+empSalary[i];
		}
		int avgSalary=totalSalary/5;
			System.out.println(avgSalary);

	}
	}
