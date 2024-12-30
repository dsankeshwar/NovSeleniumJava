package AbstractClass_ImplementingClass_Day15;

//Use Cases of Abstract Classes:
//1. Concept of traffic signals

public class ImplementingClasses extends AbstractClasses {

  @Override
  void display() {
      System.out.println("This is a display method from child class");
  }

  @Override
  int sum(int a, int b) {
      return a+b;
  }

  public static void main(String[] args) {

          ImplementingClasses ic=new ImplementingClasses();
          ic.display();
          System.out.println(ic.sum(10,20));

          //Since display1() is a private method, we cannot access it from another class
          //private methods, variables, constructors will never participate in inheritance
//          ic.display1();
  }
}