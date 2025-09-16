package com.niyaz.loose_coupling_interface_15ep;

public final class UPIPayment implements Payment
{
      private String upiId;
	public UPIPayment(String upiId) 
	{
		super();
		this.upiId = upiId;
	}

	@Override
	public void makePayment(double amount) 
	{
		System.out.println("Starting checkout for amount RS :"+amount);
		System.out.println("Paid RS :"+amount+" using UPI ID : "+upiId);	
	}

	@Override
	public void makeRefund(double amount) 
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+amount);
		System.out.println("Refunded RS "+amount+" to UPI ID : "+upiId);
	}

}
