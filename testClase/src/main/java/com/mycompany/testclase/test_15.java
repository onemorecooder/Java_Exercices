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
public class test_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce número a multiplicar: ");
        Scanner sc = new Scanner(System.in);

        
        int num = sc.nextInt();
        do {
            if (num > 10 || num <=0) {
                System.out.println("Introduce un número de 1 a 10");
                num = sc.nextInt();
            } 
            
            if (num >1 && num < 11){
                for (int i = 1; i < 11; i++) {
                    int resultado = num * i;
                    System.out.println("- " + num + "*" + i + "=" + resultado);
                }
            }
        } while (num > 10 || num <=0);
    }
}
