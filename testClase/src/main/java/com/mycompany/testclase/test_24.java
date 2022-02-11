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
public class test_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Introduce la longitud de la cifra:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 1;
        int contador = 1;

        boolean primo = true;
        for (int i = 1; i <= num; i++) {
            while ((primo) && (contador != num2)) {
                if (num2 % contador == 0) {
                    primo = false;
                    System.out.println(num2 + "no primo");
                    num2++;
                }else{
                    System.out.println(num2+" primo");
                }
                contador++;
            }
        }
        System.out.println("");
        //System.out.println("Los números primos de 1 a " + num + " son:");
    }
}
