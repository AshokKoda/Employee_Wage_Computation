package com.bridgelabz.employeewage;

import java.util.Scanner;

/*
 * Employee Wages in multiple companies
 */
public class EmployeeWageCompanies {
	
	public static final int PARTTIME = 1;
	public static final int FULLTIME = 2;
	public static String companyName;
	public static int numOfWorkingDays = 0;
	public static int ratePerHour = 0;
	public static int maxHrsPerMonth = 0;
	
	
	public static void computeEmployeeWage() {
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch (empCheck) {
			case PARTTIME:
				empHrs = 4;
				break;
			case FULLTIME:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + "" + "Emp Hr:" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * ratePerHour;
		System.out.println("Total Employee Wage:" + totalEmpWage);
	}

	public static void main(String[] args) {
		System.out.println("----Welcome To Employee Wage------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name: ");
		companyName = sc.next();
		System.out.println("Enter noof working days: ");
		numOfWorkingDays = sc.nextInt();
		System.out.println("Enter rate per hour: ");
		ratePerHour = sc.nextInt();
		System.out.println("Enter max hours: ");
		maxHrsPerMonth = sc.nextInt();
		
		computeEmployeeWage();
		

	}

}
