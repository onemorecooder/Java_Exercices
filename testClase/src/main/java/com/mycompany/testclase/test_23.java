/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

/**
 *
 * @author ajose
 */
public class test_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                int num = (int) (Math.random() * 10);
                if (num == 3) {
                    String e = String.valueOf(num);
                    e = "E ";
                    System.out.print(e);
                } else if (num != 3) {
                    System.out.print(num + " ");
                }
            }
            System.out.println("");
        }
    }

}
