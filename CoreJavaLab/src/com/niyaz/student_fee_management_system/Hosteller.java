package com.niyaz.student_fee_management_system;

public class Hosteller extends  Student
{
	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee,  double hostelFee) 
	{
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFee="
				+ hostelFee + "]";
	}

	public double  payFee(double amountPaid)
	{
		 
		 {
			 double totalfee = examFee+hostelFee;
		        if (amountPaid > totalfee) 
		        {
		            double refund = amountPaid-totalfee;
		            System.out.println("Refundabale Amount is :- "+refund);
		            return  refund;
		        } 
		        else if (amountPaid < (totalfee))
		        {
		            double remaining = totalfee-amountPaid;
		            System.out.println("Payable Amount is :"+remaining);
		            return remaining;
		            
		        } else
		        	
		        {
		        	System.out.println("Exam fees all clear");
		           
		        }
		    }
			 return amountPaid;
		 }
	
	}

