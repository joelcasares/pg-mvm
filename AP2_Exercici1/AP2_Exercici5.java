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


//Pre: Introduir un any per teclat i informar si és un any de traspàs o no. 

public class AP2_Exercici5 {
    
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
 
        System.out.println("Introdueix un any");
        int any = sn.nextInt();
 
        if ((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any % 400 == 0)) {
            System.out.println("L'any " + any + " és de traspàs");
        } else {
            System.out.println("L'any " + any + " no és de traspàs");
            
//Fi Exercici 5
//Post: Mostrar si l'any introduit per teclat és un any de traspàs o no. 
             
        }
    }
}