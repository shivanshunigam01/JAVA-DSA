package GFG_Problems;
public class MyClass
{
  private int a;
  public double b;
  
  public MyClass(int first, double second)
  {
    this.a = first;
    this.b = second;
  }

  // new method
  public static void incrementBoth(MyClass c1) {
    c1.a = c1.a + 1;
    c1.b = c1.b + 1.0;
  }

  public static void main(String[] args)
  {
    MyClass c1 = new MyClass(10, 20.5);
    MyClass c2 = new MyClass(10, 31.5);
    // different code below
    incrementBoth(c2);
    System.out.println(c1.a + ", "+ c2.a);
  }
}
