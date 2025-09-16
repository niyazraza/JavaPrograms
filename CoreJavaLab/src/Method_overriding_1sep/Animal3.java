package Method_overriding_1sep;
class Animal4 { }
class Horse4 extends Animal4 { }
public class Animal3
{
      public void doStuff(Animal4 a) 
      {
           System.out.println("In the Animal version");
      }
      public void doStuff(Horse h) 
      {
           System.out.println("In the Horse version");
      }
      public static void main (String [] args) 
      {
            Animal3 q = new Animal3();
            Animal4 ob1 = new Animal4();
            Animal4 ob2 = new Horse4();
            q.doStuff(ob1);
            q.doStuff(ob2);
     }
}