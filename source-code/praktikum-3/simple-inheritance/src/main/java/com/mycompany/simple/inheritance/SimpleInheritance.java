/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simple.inheritance;

import com.mycompany.simple.inheritance.classes.Doctor;
import com.mycompany.simple.inheritance.classes.FamilyDoctor;
import com.mycompany.simple.inheritance.classes.Surgeon;

/**
 *
 * @author ahmadfaisal
 */
public class SimpleInheritance {

	public static void main(String[] args) {
		// Instansiasi class Doctor
		// 1. Kenapa atribute pada kelas Doctor tidak bisa diakses?
		Doctor doctor = new Doctor(true);
		doctor.setWorksAtHospital(false);
		System.out.println("Doctor: " + doctor.getWorksAtHospital());
		doctor.treatPatient();

		// Instansiasi kelas FamilyDoctor
		// 2. Kenapa setWorksAtHospital juga bisa diakses di subclass?
		FamilyDoctor familyDoctor = new FamilyDoctor(false, true);
		familyDoctor.setWorksAtHospital(true);
		System.out.println("FamilyDoctor: " + familyDoctor.getWorksAtHospital());
		System.out.println("FamilyDoctor: " + familyDoctor.getMakeHouseCalls());

		// Instansiasi kelas Surgeon
		// 3. Kenapa method treatPatient di object surgeon berbeda dengan object doctor?
		Surgeon surgeon = new Surgeon(true);
		surgeon.treatPatient();
		surgeon.makeIncision();
	}
}
