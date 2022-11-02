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


//Pre: Introdueix dos nombres per saber el màxim d'aquests.

public class AP2_Exercici3I {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introdueix un nombre: ");                                                           
        n1 = sc.nextInt();
        System.out.print("Introdeix un altre nombre: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("El nombre més gran és " + n1);
        } else if (n1 < n2) {
            System.out.println("El nombre més gran és " + n2);
        } else {
            System.out.println("Els nombres són iguals");

// Fi apartat 3I
//Post: Es mostra a l'usuari el màxim dels dos nombres introduïts.
            
        }
    }
}
