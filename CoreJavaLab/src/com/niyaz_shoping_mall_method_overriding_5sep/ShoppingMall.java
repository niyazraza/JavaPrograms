package com.niyaz_shoping_mall_method_overriding_5sep;

import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Customer Type to get additional Discount :");
		System.out.println("1) General Customer");
		System.out.println("2) Prime Customer");
		System.out.println("3) VIP Customer");

		System.out.println("Please enter Customer type :");
		int choice = Integer.parseInt(sc.nextLine());
         Customer cutomer = null;
		switch (choice) {
		case 1 -> {
			System.out.println("Please Enter your Name :");
			String name = sc.nextLine();
			System.out.println("Enter number of Items :");
			int num = Integer.parseInt(sc.nextLine());

			String items[] = new String[num];
			double prices[] = new double[num];

			GeneralCustomer g = new GeneralCustomer(name);
			System.out.println("please Enter the Item Name and Price :\r\n" + "");
			for (int i = 0; i < num; i++)
			{
				System.out.println(i+1+")Items name:");
  				items[i] = sc.nextLine();
  				System.out.println(i+1+")Items price:");
				prices[i]=Double.parseDouble(sc.nextLine());
			}
			g.calculateBill(prices);

		}
		case 2 -> 
		{
			System.out.println("Please Enter your Name :");
			String name = sc.nextLine();
			System.out.println("Enter number of Items :");
			int num = Integer.parseInt(sc.nextLine());

			String items[] = new String[num];
			double prices[] = new double[num];

			PrimeCustomer g = new PrimeCustomer(name);
			System.out.println("please Enter the Item Name and Price :\r\n" + "");
			for (int i = 0; i < num; i++)
			{
				System.out.println(i+1+")Items name:");
  				items[i] = sc.nextLine();
  				System.out.println(i+1+")Items price:");
				prices[i]=Double.parseDouble(sc.nextLine());
			}
			g.calculateBill(prices);

		}

		}

	}

}
