package lab_july_16;
import java.util.Scanner;
class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int tem=num;
		int rev=0,rem;
		if(num<0) {
			System.out.println("-1");}
		else if(num<=-1)
			System.out.println("kindly provide the +ve number only");
			else if(num<100&&num>999)
			System.out.println("-2");
			else if(num==-2)
			System.out.println("only for 3 digit number");
			
		
		 while(tem!=0)
		 {
		 			rem=tem%10;
		             rev=rev*10+rem;
		             tem=tem/10;
		            
		         }
		            if (num==rev) {
		            	System.out.println("number is palindrome");
		            }
		            
		            else {
		            	System.out.println("number is not palindrom");
		            } 
			}
	}


