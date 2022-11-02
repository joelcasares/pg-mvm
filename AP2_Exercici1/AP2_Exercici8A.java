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

//Pre: Demanar números enters a l’usuari fins que aquest escrigui el número 0.

public class AP2_Exercici8A {
    public static void main( String args[] ) {

        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int num = teclat.nextInt();
        while (num != 0) {
            System.out.print("El valor és incorrecte. Introdueix un altre: ");
            num = teclat.nextInt();

//Fi apartat 8A
//Post: Mostra els números introduits. 
            
        }
    }
}