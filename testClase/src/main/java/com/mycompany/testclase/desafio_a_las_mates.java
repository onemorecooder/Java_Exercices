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
public class desafio_a_las_mates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Elige un número para el tamáño del cuadrado:");
        Scanner sc = new Scanner(System.in);
        int numAst = sc.nextInt();
        
        
        for (int i = 0; i < numAst; i++){
            for(int j = 0; j < numAst; j++){
                if(i == j || (i+j) == numAst-1){
                    System.out.printf("*");
                    System.out.printf(" ");
                } else {
                    System.out.printf(".");
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
