package com.niyaz.equal_obj_method_11sep;
class NIT12
{
	int a;
	public NIT12(int a) {
		this.a=a;
	}
	 int getNum()
	{
		return this.a;  // we can not used this or super inside static class level method
	}
}
class NIT11 extends NIT12
{
	int a;
	public NIT11(int a,int b) {
		super(a);
		this.a=b;
	}
	int getVal()
	{
		return this.a;
	}
}
public class OopsMCQ{
public static void main(String[] args) {
	NIT11 nit = new NIT11(74,152);
	System.out.print(nit.getNum()+" "+nit.getVal());
	}
}
