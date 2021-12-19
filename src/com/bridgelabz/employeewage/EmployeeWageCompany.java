package com.bridgelabz.employeewage;

public class EmployeeWageCompany {

	public  String companyName;
    public  int empPerHrs;
    public  int numMaxWorkingDay;
    public  int maxHrsInMonth;
    public  int totalEmpWage;
    
    /*
     * Constructor
     */
//	public EmployeeWageCompany(String companyName, int empWagePerHr, int numMaxWorkingDay, int maxHrsInMonth,
//			int totalEmpWage) {
//		super();
//		this.companyName = companyName;
//		this.empWagePerHr = empWagePerHr;
//		this.numMaxWorkingDay = numMaxWorkingDay;
//		this.maxHrsInMonth = maxHrsInMonth;
//		this.totalEmpWage = totalEmpWage;
//	}

	@Override
	public String toString() {
		return "EmployeeWageCompany [companyName=" + companyName + ", empWagePerHr=" + empPerHrs
				+ ", numMaxWorkingDay=" + numMaxWorkingDay + ", maxHrsInMonth=" + maxHrsInMonth + ", totalEmpWage="
				+ totalEmpWage + "]";
	}
	
	
    
    
}
