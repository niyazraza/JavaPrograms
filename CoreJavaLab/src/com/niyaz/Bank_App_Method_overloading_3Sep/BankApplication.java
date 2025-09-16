package com.niyaz.Bank_App_Method_overloading_3Sep;

import java.util.Scanner;

public class BankApplication 
{

	public static void main(String[] args)
	{
		
	   Scanner sc = new Scanner(System.in);
       System.out.println("Please select the Account Type :");
       System.out.println("1) Saving Account");
       System.out.println("2) Current Account");
       System.out.println("3) Fixed Deposit Account");
       
       System.out.println("Please enter the type of account you want to open : [1/2/3]");
       int choice = Integer.parseInt(sc.nextLine());
       
       switch(choice) 
       {
       case 1 ->
       {
    	   System.out.println("Enter account Holder Name :");
    	   String name = sc.nextLine();
    	   System.out.println("Enter account Number :");
    	   String acc = sc.nextLine();
    	   System.out.println("Enter the Amount");
    	   double amount = Double.parseDouble(sc.nextLine());
    	   SavingsAccount account = new SavingsAccount(name,acc,amount);
    	  // account.displayAccountDetails();
    	   account.calculateInterest();
    	   
       }
       case 2 ->
       {
    	   System.out.println("Enter account Holder Name :");
    	   String name = sc.nextLine(); 
    	   System.out.println("Enter account Number :");
    	   String acc = sc.nextLine();
    	   System.out.println("Enter the Amount");
    	   double amount = Double.parseDouble(sc.nextLine());
    	   CurrentAccount current = new CurrentAccount(name,acc,amount);
    	   //current.displayAccountDetails();
    	   current.calculateInterest();
    	   current.checkOverdraftLimit();
       }
       case 3->
       {
    	   System.out.println("Enter account Holder Name :");
    	   String name = sc.nextLine();
    	   sc.nextLine();
    	   System.out.println("Enter account Number :");
    	   String acc = sc.nextLine();
    	   System.out.println("Enter the Amount");
    	   double amount = Double.parseDouble(sc.nextLine()); 
    	   System.out.println("Enter the deposit term [For How many years you want to deposit] :");
    	   int rate = Integer.parseInt(sc.nextLine());
    	   FixedDepositAccount deposit = new FixedDepositAccount(name,acc,amount,rate);  
    	   //deposit.displayAccountDetails();
    	   deposit.calculateInterest();
       }
    }
      sc.close();
} 
	

}
