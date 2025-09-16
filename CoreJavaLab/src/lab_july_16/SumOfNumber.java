package lab_july_16;
import java.util.Scanner;
class SumOfNumber {
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
		if(num<0) {
			System.out.println("print-3");
		}
		else if(num>99) {
			System.out.println("print -2");
		}
		else if(num>0&&num<9) {
			System.out.println("print -1");
		}
		else {
			int rem=num%10;
			num/=10;
			int sum=num+rem;
			System.out.println("sum is:"+sum);
		}
	
	}

	}



