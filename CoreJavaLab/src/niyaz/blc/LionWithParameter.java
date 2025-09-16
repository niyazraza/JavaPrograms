package niyaz.blc;

public class LionWithParameter
{
    String lionrole;
    String lionleadership;
    String lionProtective;
    String lioncolor;
    
    public void setLionData(String roling,String leader,String Protect,String color) 
    {
    	lionrole= roling;
    	lionleadership=leader;
    	lionProtective=Protect;
    	lioncolor=color;
    }
    public void getLionData() 
    {
    	System.out.println("Lion role is:"+	lionrole);
    	System.out.println("Lion leadership is:"+lionleadership);
    System.out.println("Lion Protective is:"+lionProtective);
	System.out.println("Lion color is:"+lioncolor);
 	
    }
}
