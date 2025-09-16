package com.niyaz.elc_1_august;

import com.niyaz.blc_1_august.Rectangle;
import java.util.Scanner;
public class RectangleDemo
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the width:");
		double width = Double.parseDouble(sc.nextLine());
		
		System.err.println("Enter the heigth:");
		double height = Double.parseDouble(sc.nextLine());
		
		Rectangle rec = new Rectangle(width,height);
	    System.out.println("area of rectangle is:"+rec.getArea());
	    System.out.println("perimeter of rectangle is:"+rec.getPerimeter());
	    
		sc.close();
		
		

	}

}
