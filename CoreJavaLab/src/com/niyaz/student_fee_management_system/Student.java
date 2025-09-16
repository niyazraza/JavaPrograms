package com.niyaz.student_fee_management_system;

public class Student
{
	  protected int studentId;
      protected String name;
      protected double examFee;
      
	  public Student(int studentId, String name, double examFee) 
	  {
		super();
		
		    
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	  }
}
