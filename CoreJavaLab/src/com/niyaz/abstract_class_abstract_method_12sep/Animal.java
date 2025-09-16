package com.niyaz.abstract_class_abstract_method_12sep;

public abstract class Animal 
{
    public abstract void  roam();
    
}
class  Lion  extends Animal
{
	public void roam() 
	{
		System.out.println("Lion is roaming");
	}
	public void roar() 
	{
		System.out.println("Lion is roawer");
	}
	
}
class Dog extends Animal
{
	public void roam() 
	{
		System.out.println("Dog is roaming");
	}
	public void bark() 
	{
		System.out.println("Dog is barking");
	}
}
