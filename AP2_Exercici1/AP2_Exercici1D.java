/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2_Exercici1;

import java.util.Scanner;

/**
 *
 * @author joelcasaresserrano
 */


//Pre: L'usuari introdueix un nombre (10) per 

 public class AP2_Exercici1D {
        
     public static void main (String[] args) {
         
         Scanner teclat = new Scanner(System.in);
         
         System.out.print("Introdueix la mida del quadrat: ");
         int n = teclat.nextInt();
         
         if (n >= 0 && n<=50) {
             
             //Linea superior del quadrat
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            //Centre del quadrat
            for (int i =0; i < n-2; i++) {
                System.out.print("*");
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            //Linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            
// Fi exercici 1D 
//Post: Es mostra a la pantalla el quadrat d'asteriscs
            
            }
         }
     }      
}      