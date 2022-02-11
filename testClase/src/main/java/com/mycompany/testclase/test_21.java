/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

/**
 *
 * @author ajose
 */
public class test_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[][] cubo = new char[5][5];

        char limites = '*';

        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo.length; j++) {
                    System.out.print(limites);
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
