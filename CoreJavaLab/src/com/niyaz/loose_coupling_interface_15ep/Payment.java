package com.niyaz.loose_coupling_interface_15ep;

sealed interface Payment permits CreditCardPayment, DebitCardPayment,UPIPayment 
{
	void makePayment(double amount);
	 void makeRefund(double amount);

}