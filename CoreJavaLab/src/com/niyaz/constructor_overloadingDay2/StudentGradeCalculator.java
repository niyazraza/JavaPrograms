package com.niyaz.constructor_overloadingDay2;

import java.util.Scanner;

public class StudentGradeCalculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Students:");
		int stuDetail = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=stuDetail;i++) 
		{
			
		System.out.println("Enter the Student Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the Student Marks:");
		int marks = Integer.parseInt(sc.nextLine());
		
		Student s = new Student(name,marks);
	
		
		StudentGrade g = CalculateStudentGrade.calculateGrade(s);
		
		System.out.println(g);
		System.out.println("");
	
		}
		
		sc.close();
	}
	

}
