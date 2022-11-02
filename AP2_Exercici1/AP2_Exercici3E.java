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


//Pre: Determinar si el nombre introduit per teclat pertany al interval [25,50].

public class AP2_Exercici3E {
    
     public static void main(String[] args){
     Scanner teclat=new Scanner(System.in);
     int n;
        System.out.println("Introdueix un número:");
        n=teclat.nextInt();
     if(n >= 25 && n <= 50){
       System.out.println("El nombre pertany a l'interval");
     }else{
        System.out.println("El nombre no pertany a l'interval");
        
//Fi apartat 3E
//Post: Mostra si el nombre introduit per teclat pertany al interval [25,50].

        }
     }
}
