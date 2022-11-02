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


//Pre: Calcula la mitjana aritmètica d’un seguit de nombres que introduirà l’usuari fins que introduixi el número 0. 

public class AP2_Exercici9 {
    
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
         int n,b=0,num=5;
         double suma=0.0;
          System.out.println("Per finalitzar la mitjana, introdueix el nombre 0");
          while(num!=0){
              System.out.println("Introdueix un nombre:");
              num=sc.nextInt();
              suma=suma+num;
              b++;
          }
         System.out.println(suma/(b-1));
         
//Fi Exercici 9
//Post: Mostra la mitjana aritmètica dels nombres introduits per teclat. 
         
     }
}
