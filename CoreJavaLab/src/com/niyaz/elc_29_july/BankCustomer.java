package com.niyaz.elc_29_july;
import java.util.Scanner;

import com.niyaz.blc_29_july.Bank;
public class BankCustomer 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Bank sbi=new Bank();
		System.out.println("Enter the Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter the Account Number:");
		int number =sc.nextInt();
		System.out.println("Enter the Deposite Balance:");
		double balance =sc.nextDouble();
		System.out.println("Enter the Widhraw Balance:");
		int amount=sc.nextInt();
		sbi.setCustomerDeatils(name,number,balance);	
		sbi.withdraw(amount);
		sbi.currentBalance();
		sbi.deposit(amount);
		sbi.currentBalance();
		System.out.println(sbi.displayDetails());
		
		sc.close();
	}

}
