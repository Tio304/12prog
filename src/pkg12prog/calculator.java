/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12prog;

import java.util.Scanner;
import static pkg12prog.Main.hitung;

/**
 *
 * @author H4NS
 */
public class calculator {
    public static int Plus(int a , int b){
        
        int c = a + b;
        return c;
    }
    public static int Minus(int a, int b){
       
   int c = a-b;
   return c;
   
   
    }
    public static int Mixed(int a , int b){
        
        int c = a*b;
        return c;
        
    } 
    public static double Divide(double a , double b){
        double c = a / b;
        
        return c;
    }
        
        public static  int Lefted(int a, int b ){
           
            if (a>b){
                System.out.println("hasil Sisa Bagi Adlah : "+ (a%b));
                
            }else if (a<b){
                System.out.println("Hasil tidak ditemukan");
                
                System.out.println("\n************************");
            }
        return 0;
          
        }
         public static void main(String[]args)
    {System.out.println("=========================================== PROGRAM CALCULATOR ===========================================");
        Scanner input = new Scanner(System.in);
        int x;
        int bill;
        System.out.println("\n============= Masukkan angka ynag Plus di Inginkan =============");
        bill = input.nextInt();
         
        
            System.out.println("\n ===========Masukkan angka Plus ynag di Inginkan ==========" );
                int bil2 =input.nextInt();
             
      
        x = Plus(bill,bil2);
        
        System.out.println("Hasil : " +x + "  Hasil Plus");
        
        System.out.println("\n******************************");
        
       int a;
        System.out.println("\n ========== Masukkan angka Minus ynag di Inginkan =========== ");
       
       int  bil3 =input.nextInt(); 
       System.out.println("\n ========= Masukkan angka Minus ynag di Inginkan =========");
       int bil4 = input.nextInt();
       
      
       a = Minus(bil3,bil4);
        System.out.println("Hasil : " + a+ "  Hasil Minus");
        System.out.println("\n********************************");
        
       
        int b;
        System.out.println("\n ============= Masukkan angka  Mixed ynag di Inginkan ============="  );
        int bil5=input.nextInt();
         System.out.println("\n ============ Masukkan angka Mixed ynag di Inginkan ============" );
        int bil6= input.nextInt();
      
       
        b = Mixed(bil5,bil6);
        
        System.out.println("HAsil : " + b+ "  Hasil Mixed");
        System.out.println("\n********************************");
        
        double c ;
        System.out.println("\n ============== Masukkan angka Divided ynag di Inginkan ============"  );
        double bil7=input.nextInt();
        
         System.out.println("\n ============= Masukkan angka Divided ynag di Inginkan ==========="  );
        double bil8=input.nextInt();
        
       
        
        c =  Divide(bil7,bil8);
        System.out.println("Hasil : " + c+ "  Hasil Divide");
        System.out.println("\n***********************************************");
        
        int d;
        System.out.println("\n =========== Masukkan angka Lefted ynag di Inginkan =========="  );
        int bil9=input.nextInt(); 
          System.out.println("\n ============== Masukkan angka Lefted ynag di Inginkan ================ "  );
        int bil0 =input.nextInt();
       
       
        
        d = Lefted(bil9,bil0);
        System.out.println("***************************************");
        
        
        
    }
        
        
}
