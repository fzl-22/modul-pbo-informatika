package com.mycompany.simple.polymorphism.classes;

public class Javascript extends ProgrammingLanguage{
  public boolean executedInBrowser = true;

  public Javascript(){
    super(false, "functional");
  }

  public void display(){
    System.out.println("It's a Javascript programming language");
    super.display();
  }
}
