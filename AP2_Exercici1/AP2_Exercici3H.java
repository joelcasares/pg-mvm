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


//Pre: Introdueix un nombre per saber el quadrat d'aquest.

public class AP2_Exercici3H {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int num;
        
        System.out.print("Introdueix un nombre: "); 
        num = teclat.nextInt();

        double quadrat = Math.pow(num, 2);
        System.out.println("El resultat és " + quadrat);
            
//Fi apartat 3H
//Post: Es mostra el nombre introduït al quadrat d'aquest.
            
    } 
}

