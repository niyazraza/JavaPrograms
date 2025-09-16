package lab_july_16;
import java.util.Scanner;
class NextMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("return -1");
		}
		else {
			num=(num/100+1)*100;
			System.out.println(num);
			
		}

	}

}
