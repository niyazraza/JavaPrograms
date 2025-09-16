package niyaz_elc_30_july;
import java.util.Scanner;

import niyaz_blc_30_july.Employee;
public class EmployeeDemo {

	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  Employee e1= new Employee();
	  
	  System.out.println("Enter the employee number:");
	  int number =sc.nextInt();
	  
	  
	  System.out.println("Enter the employee name:");
	  String name=sc.next();
	 
	  System.out.println("Enter the employee salary:");
	  double salary=sc.nextDouble();
	  
	  e1.setEmployeeDetails(number, name, salary);
	  e1.getEmployeeDetails();
	  e1.calculateSalaryIncrement();
	 
      sc.close();
	  
	  
	  
	}

}
