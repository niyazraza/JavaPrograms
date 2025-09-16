package com.niyaz.method_overloading_scenario_28august;

public class Payment
{
	private boolean validationForMakePayment(double amount) 
	{
		if(amount>0) 
		{
			return true;
	}else { 
	
		return false;
	}
	}
	private boolean validateCardNumber(String cardNumber) 
	{
		int count=0;
		for(int i=0; i<cardNumber.length(); i++)
		{
			if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9')
			{
				count++;
			}
		}
	   if(cardNumber.length()==16 && count==cardNumber.length())
	   {
		   return true;
	   }
	   else 
	   {
		return false;
	}
}
	private String maskCardNumber(String cardNumber) 
	{
		return "****_****_****_"+cardNumber.substring(cardNumber.length()-4);
	}
	
	public void makePayment(double amount) 
	{
		boolean validationForMakePayment = validationForMakePayment(amount);
	  if(validationForMakePayment)
	  {
		  System.out.println("Processing payment via Cash...");
		  System.out.println("Amount Paid RS :"+amount);
		  System.out.println("Payment Successful!");
	  }
	  else {
		  System.out.println("Amount must be grater than zero");
	  }
	}
	public void makePayment(String cardHolderName,String creditCardNumber,double amount)
	{
	   boolean validateCardNumber = validateCardNumber(creditCardNumber);
	   if(validateCardNumber) 
	   {
		   System.out.println("Processing payment via Credit Card...");
		   System.out.println("Card Holder :"+cardHolderName);
		   System.out.println("Card Number :"+maskCardNumber(creditCardNumber));
		   System.out.println("Amount Paid RS :"+amount);
		 System.out.println("Payment Successful!");  
	   }
	   else 
	   {
		   System.out.println("Error:Invalid card number. It must be 16 digits.");
	   }
	}
	public void  makePayment(String debitCardNumber,double amount) 
	{
		if(validateCardNumber(debitCardNumber) && validationForMakePayment(amount))
		{
			System.out.println("Processing payment via debit Card...");
			System.out.println("Card Number:"+maskCardNumber(debitCardNumber));
			System.out.println("Amount Paid RS :"+amount);
			System.out.println("Processing payment via Debit Card...");
			System.out.println("Payment Successful!");
		}
		else 
		{
			System.out.println("Error: Invalid card number. It must be 16 digits.");
		}
	}
	
}
