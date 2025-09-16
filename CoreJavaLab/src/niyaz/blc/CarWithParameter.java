package niyaz.blc;

public class CarWithParameter
{
  String carName;
  String brandName;
  String carcolor;
  int carmilege;
  
  public void setCarInformation(String name,String bname,String color,int milege)
  {
	  carName=name;
	  brandName=bname;
	  carcolor=color;
	  carmilege=milege;
	  
  }
  public void getCarInformation() 
  {
	  System.out.println("Car name is:"+carName);
	  System.out.println("Car brandName is:"+brandName);
	  System.out.println("Car color is:"+carcolor);
	  System.out.println("Car milege is:"+carmilege);
  }
  
}
