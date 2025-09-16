package com.niyaz.method_overloading_26august;

public class ShapeCalculator
{
   public int calculateArea(int side) 
   {
	   return side*side;
   }
   public int calculateArea(int length, int width) 
   {
	   return length*length;
   }
   public double calculateArea(double radius) 
   {
	   return Math.PI *radius;
   }
}
