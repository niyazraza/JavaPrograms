package com.blc.factory_method_4August;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id;
	String department;
	private double salary;

	public Employee(String name, int id, String department, double salary) {

		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public static Employee createEmployeeObject() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee name:");
		String name = sc.nextLine();

		System.out.println("Enter the  employee id:");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the deoartment:");
		String department = sc.nextLine();

		System.out.println("Enter the employee salary:");
		double salary = Double.parseDouble(sc.nextLine());
		return new Employee(name, id, department, salary);

	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]"
				+ calculateAnnualSalary();
	}

	public double calculateAnnualSalary()  //480000
	{
		double bonus = 0;
		switch (department) {

		case "HR":
			bonus = (salary * 12) * 0.8;
			break;

		case "Sales":
			bonus = (salary * 12) * 0.1;

		case "Engineering":
			bonus = (salary * 12) * 0.15;

		case "Other":
			bonus = (salary * 12) * 0.5;
		}
		return salary * 12 + bonus;

	}

}
