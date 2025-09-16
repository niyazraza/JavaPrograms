package com.elc.factory_mthod_4August;

import java.util.Scanner;

import com.blc.factory_method_4August.Employee;

public class TestEmployee 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employees:");
		int noOfEmp = sc.nextInt();
		
		
		for(int i=1; i<=noOfEmp; i++) 
		{
			Employee emp = Employee.createEmployeeObject();
			System.out.println(emp);
		}
		sc.close();
	}

}
