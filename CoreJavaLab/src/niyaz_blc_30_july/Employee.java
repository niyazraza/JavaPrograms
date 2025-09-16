package niyaz_blc_30_july;

public class Employee
{
  int employeeNumber;
  String employeeName;
  double employeeSalary;
  
  public void setEmployeeDetails(int number,String name,double salary) 
  {
	  employeeNumber = number;
	  employeeName = name;
	  employeeSalary = salary;  
  }
    public void calculateSalaryIncrement() 
    {
    	double increment=0;
    	
    	
    if(employeeSalary<50000) 
    	{
    		increment = employeeSalary*0.1;
    		employeeSalary= employeeSalary+increment;
    		System.out.println("increment salary"+increment);
    		System.out.println("after update salary"+employeeSalary);
    		
    		
    	}
    	else if(employeeSalary >= 50000 && employeeSalary <= 80000) 
    	{
    		increment  = employeeSalary*0.07;
    		employeeSalary= employeeSalary+increment;
    		System.out.println("increment salary"+increment);
    		System.out.println("after update salary"+employeeSalary);
    		
    	}
    	else if(employeeSalary > 80000) 
    	{
    		increment  = employeeSalary*0.05;
    		employeeSalary= employeeSalary+increment;
    		System.out.println("increment salary "+increment);
    		System.out.println("after update salary "+employeeSalary);
    		
    	}
    	else 
    	{
    	 System.out.println("no increment salary");
    	}
    	
    }
    public void getEmployeeDetails() 
    {
    	System.out.println("employee number is:"+employeeNumber);
    	System.out.println("employee name is:"+employeeName);
    	System.out.println("employee salary is:"+employeeSalary);
    	
    }
	
	

 }
