package Method_overriding_1sep;
public class q34
{
       public static void main(String[] argv) 
       {
               calc(1, 1);
              
       }
       public static void calc(int i, float f) 
       {
               System.out.println("public void calc(int i, float f)");
       }
       public static void calc(float f, int i) 
       {
               System.out.println("public void calc(float f, int i)");
       }
}