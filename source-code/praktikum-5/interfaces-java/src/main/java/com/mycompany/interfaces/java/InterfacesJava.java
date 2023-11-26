/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaces.java;

import com.mycompany.interfaces.java.classes.Cat;
import com.mycompany.interfaces.java.classes.Dog;

/**
 *
 * @author ahmadfaisal
 */
public class InterfacesJava {

    public static void main(String[] args) {
        Dog anjing = new Dog();
        anjing.setName("Gukguk");
        anjing.eat();
        anjing.roam();
        anjing.beFriendly();
        anjing.play();
        anjing.breathing();
        
        Cat kucing = new Cat();
        kucing.setName("Empus");
        kucing.breathing();
        kucing.beFriendly();
        kucing.play();
    }
}
