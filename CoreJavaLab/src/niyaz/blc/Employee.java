package niyaz.blc;

public class Employee 
{
    int employeeId;
    String employeeName;
    double employeeSalary;
    
    public void setEmployeeData(int id,String name,double salary) 
    {
    	employeeId=id;
    	employeeName= name;
    	employeeSalary=salary;
  
    }
    public void getEmployeeData() 
    {
    	System.out.println("Employee id is:"+employeeId);
    	System.out.println("Employee name is:"+employeeName);
    	System.out.println("Employee salary is:"+employeeSalary);
  
    }
    
}

