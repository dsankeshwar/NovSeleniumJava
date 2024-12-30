package AbstractClass_ImplementingClass_Day15.subPackage;

import AbstractClass_ImplementingClass_Day15.NamesClass;

//Via Inheritance, we can call the protected constructor
public class SampleNew extends NamesClass {

  public SampleNew(String fName, String mName, String lName1, String lName2)
  {
      //Using the super keyword, we can call the parent class constructor
      super(fName,mName,lName1,lName2);
  }

  public static void main(String[] args) {

      SampleNew s3=new SampleNew("O","P","I","Q");
      s3.display();

      //Because this is a protected Constructor, it cannot be accessed in a different package
//      NamesClass n3=new NamesClass("J","K","L","M");
  }
}