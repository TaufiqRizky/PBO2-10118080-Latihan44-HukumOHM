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
public class PBO210118080Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai();
        Baterai btr2 = new Baterai(3, 12);
        System.out.println("Hasil Tegangan\t: "+btr2.hitungTegangan()+" volt");
    }
    
}
