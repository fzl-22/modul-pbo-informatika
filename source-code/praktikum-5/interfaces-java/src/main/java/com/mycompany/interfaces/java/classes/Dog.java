/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces.java.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Dog extends Canine implements Pet, Animal{
    private String name;
    
    @Override
    public void breathing(){
        System.out.println(name + " sedang bernafas...");
    }
    
    @Override
    public void eat(){
        System.out.println(name + " sedang makan daging...");
    }
    
    @Override
    public void roam(){
        System.out.println(name + " sedang berkelana...");
    }
    
    @Override
    public void beFriendly(){
        System.out.println(name + " sangat ramah, bintang 5...");
    }
    
    @Override
    public void play(){
        System.out.println(name + " sedang bermain...");
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
