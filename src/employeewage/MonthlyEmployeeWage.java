package employeewage;

/*
 * Monthly Employee Wage
 */
public class MonthlyEmployeeWage {
	
	public static final int partTime = 1;
	public static final int fullTime = 2;
	public static final int ratePerHour = 20;
	public static final int numOfWorkingDays = 20;

	public static void main(String[] args) {
		
		int empHrs = 0, empWage = 0, totalWage = 0;
		
		System.out.println("-------Total 20 days Wage----------");
		for(int day = 0; day < numOfWorkingDays; day++) 
		{
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck)
			{
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
			totalWage += empWage;
			System.out.println("Employee Wage: " + empWage);
		}

	}

}
