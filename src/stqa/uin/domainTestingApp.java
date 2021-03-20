/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqa.uin;

import java.util.Scanner;

/**
 *
 * @author rudi
 */
public class domainTestingApp {
    public static void main(String[] args) {
        
    
    
   
    
    
   Scanner input = new Scanner(System.in); 
       
        
        
        System.out.print("Masukkan Umur:");
        int umur=input.nextInt();
        
        
        
        
           
        if(umur>5 && umur<=10){
            System.out.println("Jenis Kelamin");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan Jenis Kelamin Anak(1/2): ");
        int jk= input.nextInt();
        
        System.out.println("==============================================");
        
        if(jk==1){
            System.out.println("Jenis Kelamin Anak: Laki-laki");
            System.out.println("Keterangan Tiket: Mendongeng");
        }
        else
        {
            System.out.println("Jenis Kelamin Anak: Perempuan");
            System.out.println("Keterangan Tiket: Menggambar");
        }
        
         
                
            }
        
        else if(umur>10 && umur<=15){
            
            System.out.println("Jenis Kelamin");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan Jenis Kelamin Anak(1/2): ");
        int jk= input.nextInt();
        
        System.out.println("==============================================");
        
        if(jk==1){
            System.out.println("Jenis Kelamin Anak: Laki-laki");
            System.out.println("Keterangan Tiket: Kuis");
        }
        else
        {
            System.out.println("Jenis Kelamin Anak: Perempuan");
            System.out.println("Keterangan Tiket: Penulisan Esai");
        }
        
                
            }
        else if(umur<=5){
            
            
            
                System.out.println("Keteranngan Tiket: Kompetisi Sajak");
           
                
            }
        
         else if(umur>15){
            
                System.out.println("Keterangan Tiket: Kompetisi Puisi");
           
                
            }
        
  
}
}
