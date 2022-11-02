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


//Pre: Demanar a l'usuari que introdueixi dos nombres per saber quin dels dos és mes gran que l'altre.

public class AP2_Exercici3B {
    
    public static void main(String[] args) {    
        Scanner reader = new Scanner(System.in); {         
     int num1, num2 = 35; 
     System.out.println("Introdueix un nombre");
     num1 = reader.nextInt();
     if (num1 <= num2) 
         System.out.println(num2 + " és major que " + num1);
     else
         System.out.println(num2 + " és menor que " + num1);

//Fi apartat 3B     
//Post: Es mostra a l'usuari quin dels dos és mes gran que l'altre.
     
         }
     } 
}
