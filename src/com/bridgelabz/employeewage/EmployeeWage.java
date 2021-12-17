package com.bridgelabz.employeewage;

/*
 * Calculate Wages till a condition of total
 * working hours or days is reached for
 * a month - Assume 100 hours and 20 days
 */
public class EmployeeWage {
	
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int RatePerHour = 20;
	public static final int WorkingDays = 20;
	public static final int MaxHoursInMonth = 100;
	
	public static int empWageCompute() {
		int EmpHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while(totalEmpHrs <= MaxHoursInMonth && totalWorkingDays < WorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck) {
			case PartTime:
				EmpHrs = 4;
				break;
			case FullTime:
				EmpHrs = 8;
				break;
				default:
					EmpHrs = 0;
			}
			totalEmpHrs += EmpHrs;
			System.out.println("Day : " + totalWorkingDays + " Employee Hrs: " + EmpHrs);
		}
		int totalEmpWage = totalEmpHrs * RatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		
		empWageCompute();

	}

}
