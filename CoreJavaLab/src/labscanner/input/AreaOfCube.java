package labscanner.input;

import java.util.Scanner;

class AreaOfCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("plz enter the side:");
		int side=sc.nextInt();
		int area=side*side*6;
		System.out.println("area of cube is:"+area);
	}

}
