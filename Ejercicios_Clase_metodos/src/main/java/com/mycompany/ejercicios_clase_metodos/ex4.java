/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_clase_metodos;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el tamaño de la tabla.");
        int x = sc.nextInt();

        int[] vec = new int[x];

        maxi(vec);

    }

    public static void maxi(int vec[]) {

        Scanner sc = new Scanner(System.in);

        int mayor = vec[0];

        for (int i = 0; i < vec.length; i++) {
            vec[i] = sc.nextInt();
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
            if (vec[i] > mayor) {
                mayor = vec[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }

}
