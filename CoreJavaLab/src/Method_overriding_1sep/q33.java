package Method_overriding_1sep;
public class q33 
{
      public static void main(String[] argv) 
      {
            System.out.println();
      }
      public static int calc(int a, int b) 
      {
           System.out.println("int");
           return a + b;
      }
      public static float calc(int c, int d) 
      {
           System.out.println("float");
           return (float) c + d;
      }
}
