package employeewage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("------Welcome To Employee Wage Computation------");
		
		/*
		 * UC1: Employee Present or Absent
		 */
		int fulltime = 1;
		double random = Math.floor(Math.random() * 10) % 2;
		
		if(random == fulltime) 
		{
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}

	}

}
