package com.mycompany.simple.polymorphism.classes;

public class ProgrammingLanguage {
  public boolean isCompiled;
  public String paradigm;

  public ProgrammingLanguage() {
    this.isCompiled = false;
    this.paradigm = null;
  }

  // constructor overloading
  public ProgrammingLanguage(boolean isCompiled, String paradigm) {
    this.isCompiled = isCompiled;
    this.paradigm = paradigm;
  }

  public void display() {
    if (isCompiled == false && paradigm == null) {
      System.out.println("It's a programming language");
    } else {
      String type = isCompiled ? "compiled" : "interpreted";
      System.out.println("It's a " + type + " and " + paradigm + " language...");
    }

  }
}
