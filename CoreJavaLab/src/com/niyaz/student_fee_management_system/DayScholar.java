package com.niyaz.student_fee_management_system;

public class DayScholar extends Student
{
    protected double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee)
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}

	public double payFee(double amountPaid) 
	{
		 {
			 
			 double totalfee = examFee+transportFee;
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

