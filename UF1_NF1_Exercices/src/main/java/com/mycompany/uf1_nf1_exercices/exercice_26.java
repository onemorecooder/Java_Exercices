/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1_nf1_exercices;
import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class exercice_26 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean calor, fred, tebi;
        int temperatura = 27;
        
        Scanner teclado = new Scanner(System.in);
        boolean bucle;
        
        do {
            
        
        bucle = true;
        temperatura = Integer.parseInt(teclado.next());
        
        calor = temperatura > 30;
        fred = temperatura < 15;
        tebi = temperatura >= 15 && temperatura <= 30;
        System.out.println("Fa calor? " + calor);
        System.out.println("Fa fred? " + fred);
        System.out.println("No fa ni calor ni fred? " + tebi);
        bucle = false;
        } while (bucle == false);
    }

}
