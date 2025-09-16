package Method_overriding_1sep;

public class q38
{
      public static void main(String[] argv) 
      {
            a("a");
            a("a", "b");
            a("a", "b", "c");
      }
      static void a(String... string) 
      {
         System.out.println(string);
         //System.out.println(Arrays.toString(string)); - solution
      }
}
//[Ljava.lang.String;@4517d9a3