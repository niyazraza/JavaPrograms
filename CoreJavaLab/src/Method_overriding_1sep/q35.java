package Method_overriding_1sep;

public class q35 
{
        public static void main(String[] argv) 
        {
               MySubclass my = new MySubclass();
               my.calc(1);
               my.calc(1.1F);
        }
}
class MyClass 
{
        public void calc(int i) 
        {
                System.out.println("public void calc(int i)");
        }
}
class MySubclass extends MyClass 
{
         public void calc(int f) 
         {
                 System.out.println("public void calc(int f)");
         }
}
