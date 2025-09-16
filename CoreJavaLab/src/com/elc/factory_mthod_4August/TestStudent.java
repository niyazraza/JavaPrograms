package com.elc.factory_mthod_4August;

import java.util.Scanner;

import com.blc.factory_method_4August.Student;

public class TestStudent
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student object:");
		int noOfObject = sc.nextInt();
		
		for(int i=1; i<=noOfObject ; i++) 
		{
			Student niyaz = Student.createStudentObject();
			System.out.println(niyaz);
		}
		sc.close();
	
	}

}
