/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

/**
 *
 * @author ajose
 */
public class asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int size = 9;
        
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        
        System.out.println("");

        for (int i = 1; i < size - 1; i++) {
            System.out.print("* ");
            for (int j = 1; j < size - 1; j++) {
                if (i == j || (i + j) == size-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            System.out.println("");
        }
        for (int i = 0  ; i < size; i++) {
            System.out.print("* ");
        }
    }
}
