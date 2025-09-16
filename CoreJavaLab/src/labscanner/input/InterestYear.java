package labscanner.input;
import java.util.Scanner;
class InterestYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter principle:");
		double principle=sc.nextDouble();
		System.out.println("plz enter rate:");
		double rate=sc.nextDouble();
		double amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
	    System.out.println("total interest of 3 year:"+amount);
	}

}
