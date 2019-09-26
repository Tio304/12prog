/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author H4NS
 */
public class main4 {
    
    public static void Menentukan(int t, int i , int o){
        if(t<i && t>o){
            System.out.println("Nilai Terbesar dalam " + t);
        }else if (i<t && o>i){
            System.out.println("NIlai Terbesar dalam "+ i);
            
        }else if (o>t && o>i){
            System.out.println("Nilai Terbesar Dalam "+ o);
            
        }
    }
    public static void main(String[]args){
        Scanner mungil= new Scanner(System.in);
        System.out.println("Masukkan NIlai yang  Anda Ingin kan Untuk Bilangan Pertama:  ");
        int x= mungil.nextInt();
        System.out.println("Masukkan Nilai yang Anda Ingin kan Untuk Bilangan Kedua:  ");
        int y= mungil.nextInt();
        System.out.println("Masukkan Nilai yang Anda Ingin kan Untuk Bilangan Ketiga:  ");
        int z = mungil.nextInt();
        
        Menentukan(x,y,z);
    }
}
