package com.niyaz.constrctor_overloading;

public class Sourcing 
{
  private int sourceId;
  private String sourcaName;
  private double basicSalary;
  private double HRAPer;
  private double DAPer;
  private int enrollmentTarget;
  private int enrollmentReached;
  private double perkPerEnrollment;
  
  
  public  Sourcing(int sourceId, String sourcaName, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
		int enrollmentReached, double perkPerEnrollment) {
	super();
	this.sourceId = sourceId;
	this.sourcaName = sourcaName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.enrollmentTarget = enrollmentTarget;
	this.enrollmentReached = enrollmentReached;
	this.perkPerEnrollment = perkPerEnrollment;
  }
  
  public double calculateGrossSalary() 
  {
	  return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);

  }
  
}
