/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simple.polymorphism;

import com.mycompany.simple.polymorphism.classes.C;
import com.mycompany.simple.polymorphism.classes.Java;
import com.mycompany.simple.polymorphism.classes.Javascript;
import com.mycompany.simple.polymorphism.classes.ProgrammingLanguage;
import com.mycompany.simple.polymorphism.classes.Python;

/**
 *
 * @author ahmadfaisal
 */
public class SimplePolymorphism {

    public static void main(String[] args) {
        int arrLength = 4;
        ProgrammingLanguage [] programmingLanguages = new ProgrammingLanguage[arrLength];
        
        programmingLanguages[0] = new ProgrammingLanguage();
        programmingLanguages[1] = new Java();
        programmingLanguages[2] = new C();
        programmingLanguages[3] = new Python();
        
        for(int i = 0; i < arrLength; i++){
            programmingLanguages[i].display();
            System.out.println("");
        }
        
//        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
//        programmingLanguage.display();
//        
//        System.out.println("");
//        
//        // downcasting
//        ProgrammingLanguage cLanguage = new C();
//        cLanguage.display();
//        
//        System.out.println("");
//        
//        ProgrammingLanguage pythonLanguage = new Python();
//        pythonLanguage.display();
//        
//        System.out.println("");
//        
//        ProgrammingLanguage javaLanguage = new Java();
//        javaLanguage.display();
//        
//        System.out.println("");
//        
//        javaLanguage = new Python();
//        javaLanguage.display();
            
            
            
//		int arrLength = 5;
		
		// ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		// programmingLanguage.display();

		// System.out.println();

		// ProgrammingLanguage cLanguage = new C();
		// cLanguage.display();

		// System.out.println();

		// ProgrammingLanguage javaLanguage = new Java();
		// javaLanguage.display();

		// System.out.println();

		// ProgrammingLanguage pythonLanguage = new Python();
		// pythonLanguage.display();

		// System.out.println();

		// programmingLanguage = new Javascript();
		// programmingLanguage.display();

		// System.out.println();

		// pythonLanguage = new Javascript();


		// Biasanya, kita hanya membuat object baru dengan tipe yang sama dengan object
		// referencenya
		// ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		// programmingLanguage.display();

		// System.out.println();

		// // Bagaimana jika kita membuatnya berbeda?
		// ProgrammingLanguage cLanguage = new C();
		// cLanguage.display();

		// System.out.println();

		// // Bagaimana jika kita membuatnya berbeda?
		// ProgrammingLanguage javaLanguage = new Java();
		// javaLanguage.display();

		// System.out.println();

		// // Bagaimana jika kita membuatnya berbeda?
		// ProgrammingLanguage pythonLanguage = new Python();
		// pythonLanguage.display();

		// int arrLength = 4;

		// ProgrammingLanguage [] programmingLanguages = new
		// ProgrammingLanguage[arrLength];
		// programmingLanguages[0] = new ProgrammingLanguage();
		// programmingLanguages[1] = new C();
		// programmingLanguages[2] = new Java();
		// programmingLanguages[3] = new Python();

		// for(int i = 0; i < arrLength; i++){
		// programmingLanguages[i].display();
		// System.out.println();
		// }
    }
}
// polymorphic array
//		ProgrammingLanguage [] programmingLanguages = new ProgrammingLanguage[arrLength];
//
//		programmingLanguages[0] = new ProgrammingLanguage();
//		programmingLanguages[1] = new C();
//		programmingLanguages[2] = new Java();
//		programmingLanguages[3] = new Python();
//		programmingLanguages[4] = new Javascript();
//
//		for(int i = 0; i < arrLength; i++){
//			programmingLanguages[i].display();
//			System.out.println();
//		}
//
