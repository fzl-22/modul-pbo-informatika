/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple.inheritance.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Surgeon extends Doctor {
  public Surgeon(boolean worksAtHospital) {
    super(worksAtHospital);
  }

  @Override
  public void treatPatient() {
    System.out.println("Membedah pasien...");
  }

  public void makeIncision() {
    System.out.println("Membuat irisan di kulit...");
  }
}
