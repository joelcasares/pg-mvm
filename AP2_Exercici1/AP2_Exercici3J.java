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


//Pre: Introdueix tres nombres per saber el màxim d'aquests.

public class AP2_Exercici3J {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introdueix un nombre: ");
        n1 = sc.nextInt();
        System.out.print("Introdueix un segon nombre: ");
        n2 = sc.nextInt();
        System.out.print("Introdueix un tercer nombre: ");
        n3 = sc.nextInt();
        
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El nombre més gran és: " + n1);                                             
            } else {
                System.out.println("El nombre més gran és: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("El nombre més gran és: " + n2);
        } else {
            System.out.println("El nombre més gran és: " + n3);

// Fi apartat 3J
//Post: Es mostra a l'usuari el màxim dels tres nombres introduïts.
            
        }
    }
}   