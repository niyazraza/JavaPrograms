package com.niyaz.factory_method_16sep;

import java.util.Scanner;

public class PaymentGatewayUsingInterface 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your payment Option :");
		System.out.println("1) Credit Card");
		System.out.println(" 2) UPI");
		System.out.println("Please Enter your Choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		PaymentGateway p = new PaymentGateway();
		
		switch(choice) 
		{
		case 1 ->
		{
				CreditCardPayment cpay=new CreditCardPayment();
				Payment initiatePayment = p.initiatePayment(cpay);
				initiatePayment.processPayment();
				initiatePayment.applyDiscount();
			}
		case 2 ->
		{
			UPIPayment upi=new UPIPayment();
			Payment initiatePayment = p.initiatePayment(upi);
			initiatePayment.processPayment();
			initiatePayment.applyDiscount();
			
		}
		default ->
		{
			System.out.println("Wrong Choice...");
		}
		}


	}

	}


