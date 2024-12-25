package InheritanceConcepts_Day14;

//extends is used to inherit the data from the parent clas
//Inherit the data means inherit the methods, variables or objects from the parent class
//In JAVA, we can inherit only one class at a time
public class ChildClass extends ParentClass
{
  //Method Overriding --> Run time Polymorphism
  //When both the methods are having same name and same set of arguments
  //in both parent and child class, then the child class will take precedence over the parent class

  @Override //This annotation will let us know whether this method is overridden or not
  public void square()
  {
      //super keyword is used to refer to the parent class -- Methods, variables, objects etc..
      super.square();
      System.out.println("This is a sqaure method from the child class");
  }

  public void rhombus()
  {
      System.out.println("This is a rhombus class");
  }

  public void parallelogram()
  {
      System.out.println("This is a parallelogram");
  }
}