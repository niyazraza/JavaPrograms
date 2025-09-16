package com.blc.factory_method_4August;

import java.util.Scanner;

public class Student
{
    private String name;
    private int age;
    private String grade;
    
    
	public Student(String name, int age, String grade)
	{
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public static Student createStudentObject() 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the age:");
		int age =Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the grade:");
		String grade = sc.nextLine();
		
		return new Student(name,age,grade);
	}

	public String toString()
	{
		return "Laptop [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	

    
}
