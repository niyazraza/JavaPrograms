package com.niyaz.blc_31_july;

public class Car 
{
     private String model;
     private int year;
     private double price;
  
     public Car (String model, int year,double price ) 
     {
    	 this.model = model;
    	 this.year = year;
    	 this.price = price;
    	 
     }

	 public String toString() {
		return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
	 }
     
  
}
