package com.mycompany.simple.polymorphism.classes;

public class C extends ProgrammingLanguage {
  public boolean hasPointer = true;

  public C(){
    super(true, "imperative");
  }

  @Override
  public void display(){
    System.out.println("It's a C programming language");
    super.display();
  }
}

// public class C extends ProgrammingLanguage {
//   public boolean hasPointer = true;

//   public C() {
//     super(true, "imperative");
//   }

//   public void display() {
//     System.out.println("It's a C programming language");
//     super.display();
//   }
// }
