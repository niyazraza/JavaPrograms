package com.niyaz.Bank_App_Method_overloading_3Sep;

public class FixedDepositAccount extends BankAccount
{
	protected double interestRate = 6.5;
	protected int depositTerm;
	
	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance,int depositTerm)
	{
		super(accountHolderName, accountNumber, balance);
		this.depositTerm=depositTerm;
		
		if(depositTerm<0)
		{
			System.out.println("Deposit term must be positive.");
			System.exit(0);
		}
	}
	
	public void calculateInterest()
	{
		super.displayAccountDetails();
		System.out.println("Fixed Deposit Interest for 5 years RS :"+(balance*interestRate)/100);
	}
	

	
}
