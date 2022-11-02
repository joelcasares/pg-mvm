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


//Pre: Introduir un any i un mes, mostrar quants dies té el mes indicat.

public class AP2_Exercici6A6B {
    
        public static void main(String[] args){
 
        int mes, any, dies = 0;
        mes = readEnter("Introdueix el mes: ");
        any = readEnter("Introdueix l'any: "); 
 
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dies = 31;
                break;
            case 4: case 6: case 9: case 11:
                dies = 30;
                break;
            case 2:
                if((any%4==0 && any%100!=0) || any%400==0){
                    dies = 29;
                }
                else{
                    dies = 28;
                }
                break;
            default:
                System.out.println("\nEl mes " + mes + " no és correcte.");
                break;
        }
 
        if(dies!=0){
            System.out.println("\nEl mes " + mes + " de l'any " + any + " té " + dies + " dies.");
        }
    }
 
    private static int readEnter(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextInt();
        
        
//Fi exercici 6A6B
//Post: Es mostra l'usuari quants dies té el mes indicat.
        
    }
}