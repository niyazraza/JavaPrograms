package com.niyaz.factory_method_16sep;

public class PaymentGateway
{
	public Payment  initiatePayment(Payment pay) 
	{
		if(pay instanceof CreditCardPayment)
		{
			System.out.println("Intiating payment for "+pay.getClass().getSimpleName());
			return pay;
		}
		System.out.println("Intiating payment for "+pay.getClass().getSimpleName());
		return pay;
	}
	

}
