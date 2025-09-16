package com.niyaz.Bank_App_Method_overloading_3Sep;

public class SavingsAccount extends BankAccount
{
     protected double interestRate=4.0;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance)
	{
	super(accountHolderName, accountNumber, balance);
    }
    public void calculateInterest()
    {
    	super.displayAccountDetails();
    	System.out.println("Savings Account Interest RS :"+(balance*interestRate)/100);
    }     
       
}
	


