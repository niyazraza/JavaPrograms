package com.niyaz.loose_coupling_interface_15ep;

public final class DebitCardPayment implements Payment
{
	private String bankName;
	

	public DebitCardPayment(String bankName) 
	{
		super();
		this.bankName = bankName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Starting checkout for amount RS :"+amount);
		System.out.println("Paid RS :"+amount+" using Debit Card Bank: State Bank of India");
				
		
		
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Order Canceled. Initiating Refund..."+"\nCancelling order for amount RS :"+amount);
		System.out.println("Refunded RS :"+amount+"to Debit Card Bank: State Bank of India");
	}
	

}
