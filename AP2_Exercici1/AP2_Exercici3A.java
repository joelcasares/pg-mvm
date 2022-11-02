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


//Pre: Demanar un nombre i indicar si és positiu o negatiu. 

public class AP2_Exercici3A {
    
     public static void main(String[] args){
     Scanner teclat=new Scanner(System.in);
     int a;
        System.out.println("Introdueix un número:");
        a=teclat.nextInt();
     if(a>0)
       System.out.println("El nombre és positiu");
     else
        System.out.println("El nombre és negatiu");

//Fi apartat 3A
//Post: Es mostra per pantalla si el nombre introduit per teclat és positiu o negatiu.
     
     }
}