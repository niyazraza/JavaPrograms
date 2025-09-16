package com.niyaz.equal_obj_method_11sep;
class NIT1
{
	int name;
	
		NIT1(int name)
		{
		this.name = name;
		}
}
public class OopsTest1
{	
	public static void main(String[] args) 
{	
		NIT1 f1 = new NIT1(10);
	    NIT1 f2 = new NIT1(10);
	    NIT1 f3 = f2;
	System.out.println(f1==f2);  // false
	System.out.println(f2==f3);  // false
	System.out.println(f1.name==f2.name); // true
	System.out.println(f2.name==f3.name);  //true
	System.out.println(f1!=f3);  // true
	
		}
}
