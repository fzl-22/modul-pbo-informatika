/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.overloading;

import com.mycompany.overloading.classes.Human;

/**
 *
 * @author ahmadfaisal
 */
public class Overloading {

    public static void main(String[] args) {
        Human unnamed = new Human();
        System.out.println(unnamed.toString());

        System.out.println("");

        Human faisal = new Human("Ahmad Faisal", 20);
        System.out.println(faisal.toString());

        faisal.walk();
        faisal.walk(3);

        System.out.println("");

        Human khuluq = new Human("Khuluqil Karim", 20, "khuluq@gmail.com");
        System.out.println(khuluq.toString());
        
        String khuluqEmailSent = khuluq.sendEmail("khuluq@gmail.com");
        System.out.println(khuluqEmailSent);
        
        khuluq.sendEmail("contact@ahmadfaisal.online", "Mengirim email sederhana");
    }
}
