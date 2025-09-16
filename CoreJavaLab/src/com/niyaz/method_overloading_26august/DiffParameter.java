package com.niyaz.method_overloading_26august;

public class DiffParameter 
{
	public void parameter(int n,char c) 
	{
		System.out.println("int = "+n);
		System.out.println("char = "+c);
		
	}
	public void parameter(char c, int n) 
	{
		System.out.println("int = "+n);
		System.out.println("char = "+c);
	}

	public static void main(String[] args)
	{
		
		DiffParameter diff = new DiffParameter();
		diff.parameter(66, 'A');
		diff.parameter('D', 67);

	}

}
