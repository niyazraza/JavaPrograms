package com.niyaz.method_overriding_4Sep;

public class PaymentProcessing {

	public static void processPayment(Payment... payments) {
		for (Payment p : payments) {
			if (p instanceof CreditCardPayment card )
			{
				p.processPayment();
			    card.offer();
			}
			if (p instanceof DebitCardPayment card) {
				p.processPayment();
				card.offer();
			}
			if (p instanceof UPIPayment card) {
				p.processPayment();
				card.offer();
			}
		}
	}

	public static void main(String[] args)
	{
		processPayment(new CreditCardPayment(), new DebitCardPayment(), new UPIPayment());

	}

}
