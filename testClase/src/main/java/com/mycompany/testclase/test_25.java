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
public class test_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la longitud de la cifra:");

        Scanner sc = new Scanner(System.in);
        int contadorDivision = 0;
        int num = sc.nextInt();
        int num2 = 1;
        int cont = 1;
        int[] culo = new int[num];
        for (int i = 1; i <= num; i++) {
            num2++;
            do {
                culo[i] = num2 / cont;
                cont++;
                if (num2 % cont == 0) {
                    contadorDivision++;
                }
            } while (culo[i] == 1);

            if (contadorDivision == 2) {
                System.out.println(num2 + " es primo.");
            } else {
                System.out.println(num2 + " no es primo.");
            }
            contadorDivision = 0;
        }

    }

}
