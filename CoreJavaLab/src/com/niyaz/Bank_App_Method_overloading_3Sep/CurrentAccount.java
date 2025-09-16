package com.niyaz.Bank_App_Method_overloading_3Sep;

public class CurrentAccount  extends BankAccount
{
	protected double overdraftLimit = 5000.0;
    
	public CurrentAccount(String accountHolderName, String accountNumber, double balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	public void calculateInterest()
	{
		super.displayAccountDetails();
		System.out.println("Current accounts do not earn interest.");
	}
	public void checkOverdraftLimit()
	{
		System.out.println("overdraftLimit amount."+overdraftLimit);
	}	

}
