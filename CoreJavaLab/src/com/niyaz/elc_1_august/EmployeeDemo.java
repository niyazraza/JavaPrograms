package com.niyaz.elc_1_august;

import java.util.Scanner;

import com.niyaz.blc_1_august.Employee;

public class EmployeeDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employeeNumber:");
		 int employeeNumber = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Enter the employeeName:");
		 String employeeName = sc.nextLine();
		 
		 System.out.println("Enter the employeeSalary:");
		 double employeeSalary = Double.parseDouble(sc.nextLine());
		 
		 
		 Employee scott = new Employee(employeeNumber,employeeName,employeeSalary);
		 scott.getEmployeeNumber();
		 scott.getEmployeeName();
		 scott.getEmployeeSalary();
		 sc.close();

		 
		 if(employeeSalary == 90000) 
		 {
			 
		 System.out.println("Employee is a Developer");
			 		
		 }
		 else if(employeeSalary == 60000) 
		 {
			 System.out.println(" Employee is a Designer");
		 }
		 else if(employeeSalary == 40000) 
		 {
			 System.out.println("Employee is a Tester");
			 		
		 }
		 
		
	}

}
