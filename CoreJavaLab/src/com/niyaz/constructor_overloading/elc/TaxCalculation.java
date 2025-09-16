package com.niyaz.constructor_overloading.elc;

import java.util.Scanner;



import com.niyaz.constrctor_overloading.*;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	double salary = Double.parseDouble(sc.nextLine());

		Employee emp = new Employee(101, "Niyaz", 10092.0, 8387.0, 9389.0);
		TaxUtil tax = new TaxUtil();
		double calculateTax = tax.calculateTax(emp);
		System.out.println("Employee TAX :" + calculateTax);
		
		System.out.println("------------------------");
		
		
		Manager m = new Manager( 102,  "Anurag" , 900000, 8386.0,  9867.0,
		 900000.0);
	//	TaxUtil = new TaxUtil();
		calculateTax = tax.calculateTax(m);
		System.out.println("Manager Tax:"+calculateTax);
		
		
		System.out.println("------------------------");
		
		
		 Trainer t = new Trainer(103, "Bikas", 950000, 9657.0, 7890.0, 3,
		 890);
	   
		calculateTax = tax.calculateTax(t);
	    System.out.println("Trainer Tax:" + calculateTax);
	    
	
	    System.out.println("------------------------");
	    
				
		Sourcing c = new Sourcing(104 , "Mithun", 970000.0, 9656.0, 7233.0, 23,20,20000);
		
	    calculateTax = tax.calculateTax(c);
		System.out.println("Sourcing Tax:" + calculateTax);
				
				
	}
	
	

}
