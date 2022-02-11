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
public class test_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Elige un número para el tamáño del cuadrado:");
        Scanner sc = new Scanner(System.in);
        int numAst = sc.nextInt();

        for (int i = 0; i < numAst; i++) {
            System.out.print("*");
            System.out.print(" ");
        }

        System.out.println("");

        for (int i = 1; (numAst - 2) >= i; i++) {
            System.out.print("*");
            System.out.print(" ");
            for (int j = 0; (numAst - 2) > j; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < numAst; i++) {
            System.out.printf("*");
            System.out.print(" ");
        }
    }
}
