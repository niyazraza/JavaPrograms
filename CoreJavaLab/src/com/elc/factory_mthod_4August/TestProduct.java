package com.elc.factory_mthod_4August;

import java.util.Scanner;

import com.blc.factory_method_4August.Product;

public class TestProduct
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("enter the product:");
		int noOfProduct = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<=noOfProduct;i++) 
		{
			Product laptop = Product.createProductObject();
			System.out.println(laptop);
		}
		
      
		sc.close();
	}

}
