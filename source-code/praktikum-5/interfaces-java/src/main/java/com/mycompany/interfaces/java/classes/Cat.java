/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces.java.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Cat implements Pet, Animal{
    private String name;
    
    @Override
    public void breathing(){
        System.out.println(name + " sedang bernafas...");
    }
    
    @Override
    public void play(){
        System.out.println(name + " sedang cakar-cakaran...");
    }
    
    @Override
    public void beFriendly(){
        System.out.println(name + " sedang mendengkur...");
    }
    
    public void setName(String name){
        this.name = name;
    }
}
