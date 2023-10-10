/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple.inheritance.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Doctor {
  protected boolean worksAtHospital;

  public Doctor(boolean worksAtHospital) {
    this.worksAtHospital = worksAtHospital;
  }

  public void treatPatient() {
    System.out.println("Memeriksa pasien...");
  }

  // berikan tambahan setter
  public void setWorksAtHospital(boolean worksAtHospital){
    this.worksAtHospital = worksAtHospital;
  }

  // berikan tambahan getter
  public boolean getWorksAtHospital() {
    return this.worksAtHospital;
  }
}