package labscanner.input;
import java.util.Scanner;
 class ConvertFahrToCelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter temp:");
		int fahrenheit=sc.nextInt();
		double celcius=(fahrenheit-32)*5/9;
		System.out.println("temp in celcius:"+celcius);
	
	}

}
