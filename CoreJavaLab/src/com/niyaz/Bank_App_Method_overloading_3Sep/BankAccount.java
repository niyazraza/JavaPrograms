package com.niyaz.Bank_App_Method_overloading_3Sep;

public class BankAccount {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC = "SBIHYD151285";

	public BankAccount(String accountHolderName, String accountNumber, double balance) 
	{
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		if (accountHolderName.isEmpty())
		{
			System.out.println("Account holder name cannot be empty.");
			System.exit(0);
		}
		if (accountNumber.isEmpty())
		{
			System.out.println("Account number cannot be empty.");
			System.exit(0);
		}
		if (balance <= 0) {
			System.out.println("Balance cannot be negative.");
			System.exit(0);
		}
	}

	public void calculateInterest()
	{
		System.out.println("Generic payment");
	}

	public void displayAccountDetails()
	{
		System.out.println("account Holder Name :" + accountHolderName);
		System.out.println("account Number :" + accountNumber);
		System.out.println("Balance RS :" + balance);
		System.out.println("IFSC CODE :" + IFSC);
	}

}
