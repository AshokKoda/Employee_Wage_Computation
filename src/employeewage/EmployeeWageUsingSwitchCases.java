package employeewage;

/*
 * Employee wage using Switch cases
 */
public class EmployeeWageUsingSwitchCases {
	
	public static final int partTime = 1;
	public static final int fullTime = 2;
	public static final int ratePerHour = 20;
	public static int empHrs = 0;
	public static int empWage = 0;

	/*
	 * Main Method
	 */
	public static void main(String[] args) {
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

		switch (empCheck) {
		case partTime:
			empHrs = 4;
			break;
		case fullTime:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * ratePerHour;
		System.out.println("Employee Wage: " + empWage);

	}

}
