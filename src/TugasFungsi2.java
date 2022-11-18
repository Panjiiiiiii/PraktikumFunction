import java.lang.Math;
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
public class TugasFungsi2 {
    public static void max(int a, int b, int c) {
       int maks;
        System.out.println("nilai tertinggi");
        maks = Math.max (a, b);
        if (c>maks){
            maks=c;
        }
        System.out.println(maks);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c = 0;
        
        System.out.println("Masukkan nilai a : ");
        a=input.nextInt();
        
         System.out.println("Masukkan nilai b : ");
        b=input.nextInt();
        
         System.out.println("Masukkan nilai c : ");
        c=input.nextInt();
        
        max (a,b,c);
    }
 
}
