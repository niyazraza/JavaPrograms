package com.niyaz.loose_coupling_interface_15ep;

public final class CreditCardPayment implements Payment
{
	private String cardHolderName;
	

	public CreditCardPayment(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void makePayment(double amount) {
		System.out.println("Starting checkout for amount RS :"+amount);
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+cardHolderName);
				
		
		
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Order Canceled. Initiating Refund..."+"\nCancelling order for amount RS :"+amount);
		System.out.println("Refunded RS :"+amount+"to Credit Card Holder :"+cardHolderName);
	}

	
	

}
