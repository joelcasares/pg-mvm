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

//Pre: Introduir un nombre i trobar si és positiu i menor que 100.    

public class AP2_Exercici3C {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introdueix un nombre: ");
        num = sc.nextInt();

        while (num != 0) {

            if (num > 0) {
                System.out.print("El nombre és positiu ");
            } else {
                System.out.print("El nombre és negatiu ");
            }
            if(num >= 100){
                System.out.println("El nombre és major que 100 ");
            }else{
                System.out.println("El nombre és menor que 100 ");
            }

            System.out.print("Introdueix un nombre: ");                                  
            num = sc.nextInt();
            
//Fi apartat 3C
//Post: Es mostra per pantalla si el nombre introduit és positiu i major que 100 o no.
        }
    } 
}
    
