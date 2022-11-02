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


//Pre: Introduir dos nombres i saber si són multiples de l'altre.
//Pre2: El primer nombre es suposa que és més gran

public class AP2_Exercici3K {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nombre, multiple;
        System.out.println("Introdueix un nombre: ");
        nombre = sc.nextInt();
        System.out.println("Introdueix un altre nombre: ");
        multiple = sc.nextInt();
        
    if (nombre % multiple == 0) {
        System.out.printf("%d és múltiple de %d", nombre, multiple);
    } else {
        System.out.println("No és múltiple");
        
//Fi apartat 3K.
//Post: Es mostra per pantalla si els nombres son múltiples entre ells o no.

        }
    }
}