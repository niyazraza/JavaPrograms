package com.niyaz.abstract_class_abstract_method_12sep;

public class AnimalDemo 
{

	public static void main(String[] args)
	{
		Lion l = new Lion();
		//l.roam();
		Dog d = new Dog();
		//d.roam();
		getAnimal(l);
		getAnimal(d);
	}
	static void getAnimal(Animal a ) 
	{
		if(a instanceof Lion)
		{
			a.roam();
			((Lion) a).roar();
		}
		else if(a instanceof Dog) 
		{
			a.roam();
			((Dog) a).bark();
		}
		else
		{
			System.out.println("Generic type");
		}
		
		
		
		
		
	}

}
