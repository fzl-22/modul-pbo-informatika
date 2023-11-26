/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclass.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Ikan extends Hewan{
    public Ikan(String nama){
        this.nama = nama;
        this.habitat = "air";
    }
    
    @Override
    public void berkembangBiak(){
        System.out.println(nama + " berkembangbiak dengan cara Y di " + habitat);
    }
    
    @Override
    public void bernafas(){
        System.out.println(nama + " bernafas menggunakan insang");
    }
}
