package july22_BLC;

public class AreaOfCircle 
{
	public static String getAreaOfCircle(double radius) {
   if(radius <=0)
   {
	   return ""+(-1);
   }
   else
   {
	   final double PI = 3.14;
	   double areaofcircle = PI * radius * radius;
	   return ""+areaofcircle;
   
   }
}

   
}

