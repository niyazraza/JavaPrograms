package com.niyaz.equal_obj_method_11sep;

public class OopsTest
{
    public String nit()
    {
        return "Welcome ";
    }

    public static void main(String[] args)
    {
    	OopsTest n = new OopsTest();
        System.out.print(n.nit());
        OopsTest nit1 = new NIT();
        System.out.print(nit1.nit());
    }
}
class NIT extends OopsTest
{
    //Add code here
    public String nit()
{
     return "to NareshIT"; 
}
}	
