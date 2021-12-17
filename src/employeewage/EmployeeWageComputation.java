package employeewage;

public class EmployeeWageComputation {
	
	public static int fulltime = 1;
	public static int RatePerHour = 20;
	public static int empHrs = 0;
	public static int empWage = 0;
	
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
	
	/*
	 * Calculate daily employee wage
	 */
	public static void dailyEmployeeWage() {
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == fulltime)
			empHrs = 8;
		else
			empHrs = 0;
		
		empWage = empHrs * RatePerHour;
		System.out.println("Employee Wage is : " + empWage);
	}

	public static void main(String[] args) {
		System.out.println("------Welcome To Employee Wage Computation------");
		
		employeeAttendence();
		dailyEmployeeWage();
	}

}
