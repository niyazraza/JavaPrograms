package com.niyaz.blc_1_august;

public class Employee 
{
     private int employeeNumber;
     private String employeeName;
     private double employeeSalary;
     
     
	 public Employee(int employeeNumber, String employeeName, double employeeSalary) {
	
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	 }


	 public int getEmployeeNumber() 
	 {
		 System.out.println("Employee number:"+employeeNumber);
		 return employeeNumber;
	 }


	 public String getEmployeeName() 
	 {
		 System.out.println("Employee name:"+employeeName);
		 return employeeName;
	 }


	 public double getEmployeeSalary() 
	 {
		 System.out.println("Employee salary:"+employeeSalary);
		 return employeeSalary;
	 }
	 
     
}
