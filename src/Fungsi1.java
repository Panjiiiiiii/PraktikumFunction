    
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mokletgaming
 */
public class Fungsi1 {
    public static void luasLingkaran (double jari) {
        double luas = 3.14*jari*jari;
        System.out.println("Luas lingkaran: "+luas);
    }
    public static double luaslingkaran2 (double jari){
         double luas = 3.14*jari*jari;
         return luas;
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Masukkan jari-jari");
        Double jari = scan.nextDouble();
        luasLingkaran (jari);
    }
}

