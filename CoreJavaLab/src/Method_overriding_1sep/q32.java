package Method_overriding_1sep;

public class q32 
{
       public static void main(String[] argv) 
       {
              System.out.println(calc(1, 2));
              System.out.println(calc(1.1F, 2.2F));
       }
       public static int calc(int a, int b) 
       {
              System.out.println("int");
              return a + b;
       }
       public static float calc(float a, float b) 
       {
              System.out.println("float");
              return a + b;
       }
}