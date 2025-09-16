package niyaz.blc;

import java.util.Scanner;

public class ProductWithoutParameter 
{
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id:");
		productId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the product name:");
		productName=sc.nextLine();
		
		System.out.println("Enter the product price:");
		productPrice = sc.nextDouble();
		sc.close();
	
	}
	  public void getProductInfo() 
	  {
		  System.out.println("ProductId is:"+productId);
		  System.out.println("ProductName is:"+productName);
		  System.out.println("ProductPriceis:"+productPrice);
		   
	  }
	

}
