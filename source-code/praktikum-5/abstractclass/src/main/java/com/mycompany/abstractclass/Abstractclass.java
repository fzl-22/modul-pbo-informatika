/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstractclass;

import com.mycompany.abstractclass.classes.Ikan;
import com.mycompany.abstractclass.classes.Kucing;

/**
 *
 * @author ahmadfaisal
 */
public class Abstractclass {

    public static void main(String[] args) {
        Kucing kucing = new Kucing("Empuss");
        kucing.berkembangBiak();
        kucing.bernafas();
        
        Ikan ikan = new Ikan("Emass");
        ikan.berkembangBiak();
        ikan.bernafas();
    }
}
