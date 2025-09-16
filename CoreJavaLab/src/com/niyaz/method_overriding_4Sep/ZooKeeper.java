package com.niyaz.method_overriding_4Sep;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Mammal 
{ 
	String name = "furry "; 
	String makeNoise() 
	{ 
		return "generic noise"; 
	} 
} 
class Zebra extends Mammal 
{ 
	String name = "stripes "; 
    @Override
	String makeNoise() 
	{ 
		return "bray"; 
	} 
} 
public class ZooKeeper { 
	public static void main(String[] args)
	{ 
		new ZooKeeper().go(); 
	} 
	void go()
	{ 
		Mammal m = new Zebra(); 
		System.out.println(m.name + m.makeNoise()); 
	} 
}