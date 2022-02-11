/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class test_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int num = leer.nextInt();

        
        int division;
        
        for (int z = 1; z <= num; z++) {
            division = num % z;
 
            if (division != 0) {
                System.out.println("el numero " + z + " no es primo");
            } else {
                System.out.println("el numero " + z + " es primo");
            }
        }

    }

}
