package com.niyaz.method_overriding_4Sep;

public class UPIPayment extends Payment
{
    public void  processPayment() 
    {
    	System.out.println("Processing UPI payment");
    }
    public void offer() 
    {
    	System.out.println("cashback of 500");
    }
}
