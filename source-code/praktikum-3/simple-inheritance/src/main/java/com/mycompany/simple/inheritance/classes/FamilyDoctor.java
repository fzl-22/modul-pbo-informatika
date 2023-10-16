package com.mycompany.simple.inheritance.classes;

public class FamilyDoctor extends Doctor {
  private boolean makeHouseCalls;

  public FamilyDoctor(boolean worksAtHospital, boolean makeHouseCalls) {
    super(worksAtHospital);
    this.makeHouseCalls = makeHouseCalls;
  }

  public void giveAdvice() {
    System.out.println("Memberikan anjuran dokter...");
  }

  // berikan tambahan getter
  public boolean getMakeHouseCalls() {
    return this.makeHouseCalls;
  }
}