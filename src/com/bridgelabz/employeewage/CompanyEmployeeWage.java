package com.bridgelabz.employeewage;

import java.util.Scanner;

/*
 * Companies Employee Wage
 */
public class CompanyEmployeeWage {

	public static final int PARTTIME = 1;
	public static final int FULLTIME = 2;
	public static final int FULLDAYHRS = 8;
	public static final int PARTDAYHRS = 4;

	public static String companyName;
	public static int numOfWorkingDays = 0;
	public static int ratePerHour = 0;
	public static int maxHrsPerMonth = 0;
	public static int NumOfCompanies = 0;

	EmployeeWageCompany[] ewc = new EmployeeWageCompany[10];
	
	public void comEmployeeWageList() {
		for(int i = 0; i < NumOfCompanies; i++) {
			int totalWage = computeEmployeeWage(ewc[i]);
			ewc[i].totalEmpWage = totalWage;
			System.out.println(ewc[i]);
		}
	}
	
	public static int computeEmployeeWage(EmployeeWageCompany employeeWageCompany) {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= employeeWageCompany.maxHrsInMonth && totalWorkingDays < employeeWageCompany.numMaxWorkingDay) {

			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case PARTTIME:
				totalWorkingDays = FULLDAYHRS;
				break;
			case FULLTIME:
				totalWorkingDays = PARTDAYHRS;
				break;

			default:
				totalWorkingDays = 0;
			}
			totalEmpHrs += empHrs;
			totalWorkingDays++;
		}
		return totalEmpHrs * employeeWageCompany.empPerHrs;
	}
	
	public void addCompanyEmployeeWage() {
		EmployeeWageCompany empWageCom = new EmployeeWageCompany();
		ewc[NumOfCompanies] = empWageCom;
		NumOfCompanies++;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter company name: ");
		companyName = sc.next();
		System.out.println("Enter noof working days: ");
		numOfWorkingDays = sc.nextInt();
		System.out.println("Enter rate per hour: ");
		ratePerHour = sc.nextInt();
		System.out.println("Enter max hours: ");
		maxHrsPerMonth = sc.nextInt();

		CompanyEmployeeWage companyEmployee = new CompanyEmployeeWage();
		companyEmployee.addCompanyEmployeeWage();
		companyEmployee.comEmployeeWageList();
	}

}
