package com.niyaz.loose_coupling_interface_15ep;

public class ShoppingCart
{
	private double totalAmount;
	

	public ShoppingCart(double totalAmount)
	{
		super();
		this.totalAmount = totalAmount;
	}

	
	public void checkout(Payment pay) 
	{
	    pay.makePayment(totalAmount);
	}


	public void cancelOrder(Payment pay) 
	{
	    pay.makeRefund(totalAmount);

	}
	

}
