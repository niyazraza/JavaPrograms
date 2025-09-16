package com.niyaz.method_overriding_4Sep;

public class DebitCardPayment extends Payment
{
    public void processPayment() 
    {
    	System.out.println("Processing Debit Card payment");
    }
    public void offer()
    {
    	System.out.println("weekend in dubai");
    }
}
