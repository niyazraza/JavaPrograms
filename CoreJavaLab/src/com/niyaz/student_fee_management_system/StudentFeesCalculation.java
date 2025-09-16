package com.niyaz.student_fee_management_system;
import java.util.Scanner;
public class StudentFeesCalculation
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Option: ");
		System.out.println("1. Hosteller Student ");
		System.out.println("2. DayScholler Student ");
		
		    
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println("You have selected Day Scholler!!!");
		switch(choice)
		{
		case 2 -> {
			
			System.out.println("Enter Student Id: ");
			int id = Integer.parseInt(sc.nextLine());
			
			  if(id<0) {
				System.err.println("Student Id cannot be zero OR -ve");
			    System.exit(0);
			  }
			    
			System.out.println("Enter Student Name :");
			String name = sc.nextLine();
			
			if(name==null || name.trim()=="" || name.equals(null)) {
			System.err.println("Name cannot be null or blank");
			System.exit(0);
			}
			
			System.out.println("Enter Exam Fees :");
			double  examfee = Double.parseDouble(sc.nextLine());
			
			if(examfee<0) {
				System.err.println("Exam fees cannot be negative");
			    System.exit(0);
			}
			
			System.out.println("Enter Transport Fee :");
			double  transportfee = Double.parseDouble(sc.nextLine());
			System.out.println("Enter your total Fees :");
			double totalfee = Double.parseDouble(sc.nextLine());
			DayScholar d = new DayScholar(id,name,examfee,transportfee);
			System.out.println(d);
			double payFee = d.payFee(totalfee);
			
			
		}
		case 1  ->  {
			
			System.out.println("Enter Student Id: ");
			int id = Integer.parseInt(sc.nextLine());
			
			  if(id<0) {
				System.err.println("Student Id cannot be zero OR -ve");
			    System.exit(0);
			  }
			    
			System.out.println("Enter Student Name :");
			String name = sc.nextLine();
			
			if(name==null || name.trim()=="" || name.equals(null)) {
			System.err.println("Name cannot be null or blank");
			System.exit(0);
			}
			
			System.out.println("Enter Exam Fees :");
			double  examfee = Double.parseDouble(sc.nextLine());
			
			if(examfee<0) {
				System.err.println("Exam fees cannot be negative");
			    System.exit(0);
			}
			
			System.out.println("Enter hostel Fee :");
			double  hostelfee = Double.parseDouble(sc.nextLine());
			System.out.println("Enter your total Fees :");
			double totalfee = Double.parseDouble(sc.nextLine());
			Hosteller h = new Hosteller(id,name,examfee,hostelfee);
			System.out.println(h);
			double payFee = h.payFee(totalfee);
				
		} default -> {
			System.out.println("Invalid type");
		}
	
		
		} 	sc.close();
			
		
	}

}
