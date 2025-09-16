package lab.question.get.output;
class Laptop
{
void access()  // non static method
{
System.out.println("Copy java soft copies... ");
}
}
class Faculty
{
static Laptop password = new Laptop();  // static variable it will hold object the Laptop class
}
class Student
{
public static void main(String[] args)  // execution always start from main method
{
Faculty.password.access(); //
}
}
