package com.niyaz.method_overloading_26august;

public class ArithmeticOperation 
{

	public static void main(String[] args)
	{
		Calculator sum = new Calculator();
		System.out.println("sum of two integer is:"+sum.add(18,18));
		System.out.println("sum of two double is:"+sum.add(18.4,18.4));
		System.out.println("..............................");
		System.out.println("Multiplication of two integer is:"+sum.multiply(12,12));
		System.out.println("Multiplication of two double is:"+sum.multiply(12.4,12.4));
	}
	

}
