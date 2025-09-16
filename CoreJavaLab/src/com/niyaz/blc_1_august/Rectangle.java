package com.niyaz.blc_1_august;

public class Rectangle
{
     private double width;
     private double height;
     
     
	 public Rectangle(double width, double height) 
	 {
		 
		
	  if(width<0 || height<0) 
	  {
			 System.err.println("Width and height must be non-negative.");
			 System.exit(0);
	  }
		 
		this.width = width;
		this.height = height;
	 }
	 
	 

	 public double  getArea() 
	 {
		 
		 double area=width*height;
		 return area;
	 }
	 public double getPerimeter()
	 {
		 double perimeter = 2*(width+height);
		 return perimeter;

	 }    
}
