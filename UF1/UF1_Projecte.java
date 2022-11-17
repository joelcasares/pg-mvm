/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UF1;
import java.util.Scanner;

/**
 *
 * @author joelcasaresserrano
 */
public class UF1_Projecte {
    
    //Pre: Demanar a l'usuari informació per mostrar per pantalla. 
    public static void main(String[] args) {    
    int id, edat, tipusVenda, tipusCompra, importCompra, tlf;
    int intents = 0;
    Scanner teclat=new Scanner (System.in);
    
        //Introduir ID
        System.out.println("ID: ");
        id=teclat.nextInt();
        if((id < 111) || (id > 999)) {
            do {
                System.out.println("L'ID és invàlid.");
                id = teclat.nextInt();
                intents = intents + 1;
            } while (intents < 2); 
            } if (intents == 2) {
                System.out.println("Finalitzat per error de dades.");
                return;
             }    
        
    
        
        //Introduir edat    
        System.out.println("Edat: ");
        edat=teclat.nextInt();
        if((edat < 14) || (edat > 120)) {
            do {
                System.out.println("L'edat és invàlida.");
                edat = teclat.nextInt();
                intents = intents + 1;
            } while (intents < 2);
            } if (intents == 2) {
                System.out.println("Finalitzat per error de dades.");
                return;
        }
       
            
        //Introduir tipus de compra
        System.out.println("Tipus de compra: Venda lliure (0), Pensionista (1), Carnet jove (2), Soci (3)");
        tipusCompra=teclat.nextInt();
            if (tipusCompra < 0 || tipusCompra > 3) {
                System.out.println("El nombre introduït és invàlid.");
            }
            
        switch (tipusCompra) {
            case 0 -> { 
                System.out.println("Venda lliure");
                tipusCompra = 0;
            }
            case 1 -> { 
                System.out.println("Pensionista");
                tipusCompra = 1;
            }
            case 2 -> { 
                System.out.println("Carnet jove");
                tipusCompra = 2;
            }
            case 3 -> { 
                System.out.println("Soci");
                tipusCompra = 3;
            }
            default -> System.out.println("Error. Introdueix un nombre del 0 al 3.");
        }    
            System.out.println("El tipus de compra és: " + tipusCompra++);
                    
        //Introduir import de compra       
        System.out.println("Import de la compra: ");
        importCompra=teclat.nextInt();
            if (importCompra < 0 || importCompra > 1000) {
                System.out.println("L'import és invàlid.");
            }
            
            
        //Introduir telèfon de contacte        
        System.out.println("Telèfon de contacte");
        tlf=teclat.nextInt();
            if (tlf < 111111111 || tlf > 999999999) {
                System.out.println("El telèfon no és vàlid.");
            }
        System.out.println("  ");
        System.out.println("  ID:  " + id + "  Edat:  " + edat + 
                "  Tipus:  " + tipusCompra + "  Import:  " + importCompra + 
                "  Telèfon:  " + tlf); 
        }
    }   
//Post: Es mostra per pantalla la informació introduida per teclat.

//*Nota: No he aconseguit realitzar correctament l'ús del "return" per 
//       poder finalitzar el programa. 

