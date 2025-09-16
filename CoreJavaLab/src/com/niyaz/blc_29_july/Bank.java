package com.niyaz.blc_29_july;

public class Bank 
{
	private String customerName;
	int accountNumber;
	double currentBalance;
	
	public static String bankName="sbi"; 
	public static String bankAddress="ameerpet"; 
	public static String bankIFSCCode="sbi1233233";
	
	public void setCustomerDeatils(String name,int number,double balance)
	{
		 customerName = name;
		 accountNumber = number;
		 currentBalance  = balance;	
	}
	public void withdraw(double amount) 
	{
		if(amount>currentBalance) 
		{
			System.out.println("You have insufficient balance");
		}
		currentBalance=currentBalance-amount;
		System.out.println("withdraw successfully");
	}
	public void deposit(double amount) 
	{
		if(amount<=0) 
		{
			System.out.println("Invalid amount");
		}
		currentBalance=currentBalance+amount;
		System.out.println("deposite sucessfully");
			
	}
	public void currentBalance() 
	{
		System.out.println("Current balance is"+currentBalance);
	}
	
	public String displayDetails() 
	{
		return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
	}
	
		
	}


 