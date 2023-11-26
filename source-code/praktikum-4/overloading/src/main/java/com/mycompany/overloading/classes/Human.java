/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.overloading.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Human {
    // attributes
    public String name;
    public int age;
    public String email;

    // constructor overloading
    // memungkinkan karena constructor sejatinya adalah method, hanya saja lebih
    // spesial
    public Human() {
        // default constructor
        this.name = "unnamed";
        this.age = 0;
        this.email = "example@gmail.com";
    }

    public Human(String name, int age) {
        // overloaded constructor
        this.name = name;
        this.age = age;
        this.email = "empty";
    }

    public Human(String name, int age, String email) {
        // overloaded constructor
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // methods
    public void walk() {
        System.out.println(this.name + " " + "sedang berjalan");
    }

    // overloaded method
    public void walk(int hourDuration) {
        System.out.println(this.name + " " + "sedang berjalan selama" + " " + hourDuration + " " + "jam.");
    }

    public String sendEmail(String receiver) {
        return "Email terkirim dari " + this.email + " ke " + receiver;
    }

    public void sendEmail(String receiver, String subject) {
        System.out.println("Email terkirim dari " + this.email + " ke " + receiver);
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return "Name\t: " + this.name + "\n" + "Age\t: " + this.age + "\n" + "Email\t: " + this.email;
    }
}