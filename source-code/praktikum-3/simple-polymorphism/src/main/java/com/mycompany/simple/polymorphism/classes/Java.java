package com.mycompany.simple.polymorphism.classes;

public class Java extends ProgrammingLanguage {
  public boolean hasJVM = true;

  public Java(){
    super(true, "object-oriented");
  }
  
  @Override
  public void display(){
    System.out.println("It's a Java programming language");
    super.display();
  }
}
// public class Java extends ProgrammingLanguage {
//   public boolean hasJVM = true;

//   public Java() {
//     super(true, "object-oriented");
//   }

//   public void display() {
//     System.out.println("It's a Java programming language");
//     super.display();
//   }
// }
