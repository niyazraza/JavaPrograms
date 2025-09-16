package com.niyaz.factory_method_16sep;

public interface Payment 
{
    public  abstract void processPayment();
    public abstract void applyDiscount();
}
   class CreditCardPayment implements Payment
  {

	@Override
	public void processPayment() 
	{
	    System.out.println("Processing "+getClass().getSimpleName()+"...");
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying 10% discount for "+getClass().getSimpleName()+" users.");
	}
	  
  }
   class  UPIPayment  implements Payment
   {

	@Override
	public void processPayment() 
	{
		System.out.println("Processing "+getClass().getSimpleName()+".");
		
	}

	@Override
	public void applyDiscount()
	{
		System.out.println("Applying ₹100 cashback for "+getClass().getSimpleName()+" users.");
		
	}
	   
   }
