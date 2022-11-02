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


//Pre: Mediant l'estructura switch, introduir un nombre i retornar el nom del mes, i mostrar si és valid o no.

public class AP2_Exercici4B {

    public static void main(String[] args) {
        int num = 0;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Introdueix un nombre: ");
        num = read.nextInt();

       switch (num) {
           case 1: 
               System.out.println("Gener");
               break;
           case 2: 
               System.out.println("Febrer");
               break;
            case 3: 
               System.out.println("Març");
               break;
            case 4: 
               System.out.println("Abril");
               break;
            case 5: 
               System.out.println("Maig");
               break;
            case 6: 
               System.out.println("Juny");
               break;
            case 7: 
               System.out.println("Juliol");
               break;
            case 8: 
               System.out.println("Agost");
               break;
            case 9: 
               System.out.println("Setembre");
               break;
            case 10: 
               System.out.println("Octubre");
               break;
            case 11: 
               System.out.println("Novembre");
               break;
            case 12: 
               System.out.println("Desembre");
               break;
           default:
               System.out.println("Nombre invàlid");
               break;

//Fi apartat 4B
//Post: Mostra el nom del mes segons el nombre introduit i si és valid o no.

       }
    }
}