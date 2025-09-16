package com.niyaz.constructor_overloadingDay2;

public class StudentGrade
{
   private Student Student;
   private char studentGrade;
   
   
   public StudentGrade(Student student, char studentGrade) 
   {
	super();
	Student = student;
	this.studentGrade = studentGrade;
   }


   public Student getStudent() {
	return Student;
   }


   public void setStudent(Student student) {
	Student = student;
   }


   public char getStudentGrade() {
	return studentGrade;
   }


   public void setStudentGrade(char studentGrade) {
	this.studentGrade = studentGrade;
   }


   @Override
   public String toString() {
       return "[The Student " + Student.getName()+ " has '" + studentGrade+ "' Grade]";
   }


   
   
   
}
