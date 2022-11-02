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


//Pre: Introduir dos nombres per trobar si el mòdul dels dos és menor que 15.

public class AP2_Exercici3F {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Introduce dos nombres enters:  "); 
            
            int n1 = input.nextInt();
            int n2 = (int) input.nextDouble();
            int mod = n1%n2;
        
        System.out.println("El mòdul "+" de "+n1+" i "+n2+" és "+mod);
                
        if (mod >= 15) {
        System.out.println("i el resultat és major que 15.");
        } else 
        System.out.println("i el resultat és menor que 15.");

//Fi apartat 3F        
//Post: Es mostra el mòdul dels dos nombres i si és menor que 15.      

    }
}    