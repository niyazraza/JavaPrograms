package com.niyaz.method_overloading_scenario_28august;

import java.util.Scanner;

public class PaymentProcess
{

	public static void main(String[] args) 
	{
		
		Payment pay=new Payment();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("1.Payment by using Cash ");
		System.out.println("2.Payment by using Credit Card");
		System.out.println("3.Payment by using Debit Card ");
		
		System.out.println("Please enter your Payment choice [1/2/3]\r\n"
				+ "");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1 -> 
			{
				System.out.println(" Enter the amount you want to pay through cash :");
				double amt=Double.parseDouble(sc.nextLine());
				pay.makePayment(amt);
				
			}
      	
			case 2 ->
			{
				System.out.println(" Enter your name :");
				String name  = sc.nextLine();
				System.out.println(" Enter your 16 digit Credit Card Number :");
				String amt = sc.nextLine();
				System.out.println(" Enter your Payment Amount :");
				double am = Double.parseDouble(sc.nextLine());
		       pay.makePayment(name, amt, am);
			}
			case 3 ->
			{
				System.out.println(" Enter your 16 digit Debit Card Number :");
				String num = sc.nextLine();
				System.out.println(" Enter your Payment Amount :");
				double amount = Double.parseDouble(sc.nextLine());
				pay.makePayment(num, amount);
			}
		}
	
	}

}
