package Method_overriding_1sep;

public class q3
{
       public static void main(String[] argv) 
       {
             MyClass sub = new MySubclass();
             sub.calc(1, 2);
             sub.calc(1.1F, 1.0F);
       }
}
class MyClass 
{
        public void calc(int i, int j) 
        {
              System.out.println("public void calc(int i, int j) from MyClass");
        }
        public void calc(float f, float f1) 
        {
               System.out.println("public void calc(float f, float f) from MyClass");
        }
}
class MySubclass extends MyClass 
{
        public void calc(int i, int j) 
        {
                System.out.println("public void calc(int i, int j) from MySubclass");
        }
}