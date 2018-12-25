package com.organisation;

public class EmployeeInformation {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;

	 private String employeeCommunity;

	public int getEmployeeId() {
		return employeeId;
	}

	public EmployeeInformation(int employeeId, String employeeName,String employeeDesignation, double employeeSalary, String employeeCommunity) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeCommunity = employeeCommunity;
	}

	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary
				+ ", employeeCommunity=" + employeeCommunity + "]";
	}

	
	
}
