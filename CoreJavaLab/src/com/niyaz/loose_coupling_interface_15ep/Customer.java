package com.niyaz.loose_coupling_interface_15ep;

import java.util.Scanner;

public class Customer
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total bill Amount :");
		
		System.out.println("Choose Payment Method:");
		System.out.println("1. Credit Card");
		System.out.println("2. Debit Card");
		System.out.println("3. UPI Card");
		
		int select = Integer.parseInt(sc.nextLine());
		
		switch(select) 
		{
		case 1->
		{
			System.out.println("Enter the Amount");
			double amt = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the CardHolder Name");
			String name= sc.nextLine();
			CreditCardPayment cd = new CreditCardPayment(name);
			cd.makePayment(amt);
			cd.makeRefund(amt);	
		}
		case 2->
		{
			System.out.println("Enter the Amount");
			double amt = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the Bank Name");
			String name= sc.nextLine();
			DebitCardPayment dp = new DebitCardPayment(name);
			dp.makePayment(amt);
			dp.makeRefund(amt);	
		}
		case 3->
		{
			System.out.println("Enter the Amount");
			double amt = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the UPI ID");
			String upi= sc.nextLine();
			UPIPayment upiid = new UPIPayment(upi);
			upiid.makePayment(amt);
			upiid.makeRefund(amt);
		}
		
		}
	}

}
