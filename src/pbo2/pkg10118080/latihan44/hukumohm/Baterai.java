/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan44.hukumohm;

/**
 *
 * @author USER
 */
public class Baterai {
    private float kuatArus,hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println("");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
        System.out.println("Kuat Arus\t: "+kuatArus+" ampere");
        System.out.println("Hambatan\t: "+hambatan+" ohm");
    }
    

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float  hitungTegangan(){
        return this.hambatan*this.kuatArus;
    }
    
    
}
