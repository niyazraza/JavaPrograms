package com.niyaz.abstract_method_10sep;

public class DigitalProduct extends Product {
	private String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	double totalprice = 0.0;

	@Override
	public void applyDiscount(double percentage) {
		double discount = getPrice() * percentage / 100;
		totalprice = getPrice() - discount;
		System.out.println("Discount applied : " + discount);

		System.out.println("New Price : " + totalprice);
	}

	@Override
	public double calculateTax() {

		return totalprice * 0.05;
	}

	@Override
	public String toString() {
		return "" + super.toString() + " \n " + "License Key: " + licenseKey;
	}

}
