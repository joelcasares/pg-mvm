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


//Pre: Formar un triangle d'asteriscs

public class AP2_Exercici1E{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix número de files: ");
        int numFiles = sc.nextInt();
        sc.close();
        
        System.out.println();
        for(int altura = 1; altura<=numFiles; altura++){
            //Espais en blanc
            for(int blancs = 1; blancs<=numFiles-altura; blancs++){
                System.out.print(" ");
            }
 
            //Asteriscs
            for(int asteriscs=1; asteriscs<=(altura*2)-1; asteriscs++){
                System.out.print("*");
            }
            System.out.println();
            
// Fi exercici 1E
//Post: Es mostra a pantalla el triangle d'asteriscs

        }
    }
}