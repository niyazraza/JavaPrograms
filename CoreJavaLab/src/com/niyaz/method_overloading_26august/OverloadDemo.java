package com.niyaz.method_overloading_26august;

public class OverloadDemo 
{

	public static void main(String[] args) 
	{
		DataTypePrinter  dp = new DataTypePrinter();
		dp.printData((byte)8);
		dp.printData((short)12);
		dp.printData(32767);
		dp.printData(123344567L);
		dp.printData(12f);
		dp.printData(12.3);
		dp.printData('A');
		dp.printData(true);
		dp.printData("Niyaz");

	}

}
