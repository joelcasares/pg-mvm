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


//Pre: Introdueix un nombre per saber si és parell o senar.

public class AP2_Exercici3G {
    public static void main(String [] args) {
        Scanner teclat = new Scanner(System.in);
        int n;
        System.out.print("Introdueix un nombre: "); 
        n = teclat.nextInt();
        
        if(n % 2 ==0) {
            System.out.println(n+" és un nombre parell.");
        }else {
            System.out.println(n+" és un nombre senar.");
            
//Fi apartat 3G
//Post: Es mostra si el nombre introduit és parell o senar.
            
        }
    }
}
