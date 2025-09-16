package Method_overriding_1sep;

class Animall { }
class Horse extends Animall { }
public class q30
{
      public void doStuff(Animall a) 
      {
           System.out.println("In the Animal version");
      }
      public void doStuff(Horse h) 
      {
           System.out.println("In the Horse version");
      }
      public static void main (String [] args) 
      {
            q30 q = new q30();
            Animall ob1 = new Animall();
            Horse ob2 = new Horse();
            q.doStuff(ob1);
            q.doStuff(ob2);
     }
}
