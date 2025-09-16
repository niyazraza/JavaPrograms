package july22_ELC;

import july22_BLC.NextMultipleOfHundredBLC;
//import java.util.Scanner;
public class NextMultipleOfHundredELC {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number:");
		
		int number = NextMultipleOfHundredBLC.getNextMultipleOfHundred(123);
		System.out.println("Result:"+number);
		//sc.close();
	}

}
