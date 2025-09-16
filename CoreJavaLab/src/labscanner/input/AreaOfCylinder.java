package labscanner.input;
import java.util.Scanner;
class AreaOfCylinder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the area:");
		final double pi=3.14;
		int heigth=sc.nextInt();
		int radius=sc.nextInt();
		double area=2*pi*radius*radius+2*pi*radius*heigth;
		System.out.println("area of cylinder"+area);

	}

}
