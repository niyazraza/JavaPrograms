package com.niyaz.method_overloading_2Sep;
import java.util.Scanner;
public class EmployeeSalary 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***Salary Calculation Menu***");
		System.out.println("1) FullTime Employees ");
		System.out.println("2) PartTime Employees ");
		System.out.println("Please select the Employee type ");
		
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1 -> 
		{
			System.out.println("Enter Fulltime Employee Id :");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Fulltime Employee Name :");
			String name = sc.nextLine();
			System.out.println("Enter the Salary :");
			double sal = Double.parseDouble(sc.nextLine());
			FullTimeEmployee emp = new FullTimeEmployee(id,name,sal);
			System.out.println(name+" Salary is "+emp.calculateSalary());
		}
		case 2 ->
		{
			System.out.println("Enter PartTime Employee Id :");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter PartTime Employee Name :");
			String name = sc.nextLine();
			System.out.println("Enter your hourly rate:");
			double rate = Double.parseDouble(sc.nextLine());
			System.out.println("Enter your total works hour in the month :");
			int hour = Integer.parseInt(sc.nextLine());
			Employee emp = new Employee(id,name);
			PartTimeEmployee emp1 =  new PartTimeEmployee(id,name,rate,hour);
			System.out.println(name+" Salary is "+emp1.calculateSalary());
		 }
		
	  }
		sc.close();
  }

}
