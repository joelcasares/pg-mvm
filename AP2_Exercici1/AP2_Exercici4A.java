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


//Pre: Mediant l'estructura if-else, un nombre i retornar el nom del mes, i mostrar si és valid o no.

public class AP2_Exercici4A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introdueix un mes de l'any en números: ");
        int mes = sc.nextInt();
        
        if (mes >= 1 && mes <= 12);
            System.out.println("Mes vàlid");
            
            if (mes==1) {
                System.out.println("Gener");
            }else {
                if (mes==2) {
                System.out.println("Febrer");
                }else {
                    if (mes==3) {
                    System.out.println("Març");
                    }else {      
                        if (mes==4) {
                        System.out.println("Abril");
                        }else {
                            if (mes==5) {
                            System.out.println("Maig");
                            }else {                            
                                if (mes==6) {
                                System.out.println("Juny");
                                }else {                             
                                    if (mes==7) {
                                    System.out.println("Juliol");
                                    }else { 
                                        if (mes==8) {
                                        System.out.println("Agost");
                                        }else { 
                                           if (mes==9) {
                                           System.out.println("Setembre");
                                           }else { 
                                               if (mes==10) {
                                               System.out.println("Octubre");
                                               }else { 
                                                   if (mes==11) {
                                                   System.out.println("Novembre");
                                                   }else { 
                                                      if (mes==12) {
                                                      System.out.println("Desembre");
                                                      }else {                                  
                                                       System.out.println ("Mes invàlid");

//Fi apartat 4A
//Post: Mostra el nom del mes segons el nombre introduit i si és valid o no.

                                                       
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } 
                    }
                }
            }
        }
    }
}
