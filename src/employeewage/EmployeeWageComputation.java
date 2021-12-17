package employeewage;

public class EmployeeWageComputation {
	
	public static int fulltime = 1;
	
	/*
	 * UC1: Employee Present or Absent
	 */
	public static void employeeAttendence() {
		
		double random = Math.floor(Math.random() * 10) % 2;
		
		if(random == fulltime) 
		{
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	}

	public static void main(String[] args) {
		System.out.println("------Welcome To Employee Wage Computation------");
		
		employeeAttendence();
	}

}
