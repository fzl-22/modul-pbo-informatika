package com.mycompany.simple.polymorphism.classes;

public class Python extends ProgrammingLanguage {
  public boolean isLooselyTyped = true;

  public Python() {
    super(false, "OOP");
  }

  public void display() {
    System.out.println("It's a Python programming language");
    super.display();
  }
}
