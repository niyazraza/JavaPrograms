package july22_ELC;

import java.util.Scanner;

import july22_BLC.Calculate;

public class SqaureAndCube
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("result is :"+Calculate.getSqaureAndCube(num));
		sc.close();
	}
	

}
