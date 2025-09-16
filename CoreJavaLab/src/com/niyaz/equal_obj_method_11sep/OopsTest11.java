package com.niyaz.equal_obj_method_11sep;
class NIT13
{
	static int a=90;
	String object;
	public NIT13(String name) {
		this.object=name;
		NIT13.this.a+=1;
	}
	static int get_counter()
	{
		return NIT13.a;
	}
}

public class OopsTest11
{
	public static void main(String[] args) {
		NIT13 nit = new NIT13("nit");
		NIT13 nit1 = new NIT13("nit");
		NIT13  nit2 = new NIT13("nit");
		NIT13  nit3 = new NIT13("nit");
		NIT13  nit4 = new NIT13("nit");
		NIT13  nit5 = new NIT13("nit");
		NIT13  nit6 = new NIT13("nit");
		NIT13  nit7 = new NIT13("nit");
		System.out.println(NIT13.get_counter()-91);
	}
}
