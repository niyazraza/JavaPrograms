package labscanner.input;
import java.util.Scanner;
public class ConvertCelToFahr {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("plz enter temp:");
			int celcius=sc.nextInt();
			double fahrenheit=((9*celcius)/5)+32;
			System.out.println("temp in fahrenheit:"+fahrenheit);
		
		}

	}
