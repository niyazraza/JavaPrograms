package com.niyaz.abstract_class_abstract_method_12sep;

import java.text.DecimalFormat;

public abstract class Shape 
{
	public abstract double getArea();

	public abstract void printDetails();

}

class Rectangle extends Shape
{
	double length;
	double breadth;
	
	
	public Rectangle(double length, double breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double getArea()
	{
		
		return length*breadth;
	}


	@Override
	public void printDetails() 
	{
	    System.out.println("Type = "+getClass().getSimpleName()+"\nLength = "+length+"\nBreadth = "+breadth+"\nArea = "+getArea());
		
	}
	
}
    class Circle extends Shape
    {
    	   double radius;

		   public Circle(double radius)
		   
		   {
			super();
			this.radius = radius;
		   }

		   @Override
		   public double getArea()
		   {
			
			return Math.PI*radius*radius;
		   }

		   @Override
		   public void printDetails()
		   {
			   DecimalFormat df=new DecimalFormat("00000.00");
		    System.out.println("Type = "+getClass().getSimpleName()+"\nRadius "+radius+"\nArea "+(df.format(getArea())));
			
		   }
    }
    class Triangle extends Shape
    {
    	    double base;
    	     double heigth;
			 public Triangle(double base, double heigth) 
			 {
				super();
				this.base = base;
				this.heigth = heigth;
			 }
			 @Override
			 public double getArea()
			 {
				
				return 0.5*base*heigth;
			 }
			 @Override
			 public void printDetails() 
			 {
				//DecimalFormat df=new DecimalFormat("00:00");
				
				 System.out.println("Type = "+getClass().getSimpleName()+"\nBase "+base+"\nHeigth "+heigth+"\nArea = "+getArea());
				
			 }  
    }