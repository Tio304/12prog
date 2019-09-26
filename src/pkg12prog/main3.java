/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12prog;

import java.util.Scanner;

/**
 *
 * @author H4NS
 */
public class main3 {
    
    public static double Stance (double a, double b){
        
        
        double c = a/b;
        return c;
        
        
        
    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("====== SELAMAT DATANG DI LAYANAN HITUNG KECEPATAN ======");
        double x;
        
        System.out.println("\n==== MASUKKAN JARAK TEMPUH KENDARAAN ====");
        double bil6=input.nextInt();
        
        System.out.println("\n==== MASUKKAN WAKTU TEMPUH KENDARAAN ====");
        double bil7=input.nextInt();
        
        x= Stance(bil6,bil7);
        System.out.println("Kecepatan "+x+ " KM/jam");
    }
    
    
}
