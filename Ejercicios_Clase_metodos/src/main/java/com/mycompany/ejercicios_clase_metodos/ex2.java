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
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, numero3, max;
        System.out.println("Introduce dos números y sabrás cual es mayor:");
        System.out.println("Num1:");
        numero1 = sc.nextInt();
        System.out.println("Num2:");
        numero2 = sc.nextInt();
        System.out.println("Num3:");
        numero3 = sc.nextInt();
        
        max = maxi(numero1, numero2, numero3);
    }
    
    public static int maxi (int num1, int num2, int num3){
        int max = 0;
        if (num1 == num2 && num1 == num3){
            System.out.println("Los números son iguales.");
        } else if (num1 > num2 && num1 > num3){
            max = num1;
            System.out.println("El número más grande es " + max);
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
            System.out.println("El número más grande es " + max);
        } else {
            max = num3;
            System.out.println("El número más grande es " + max);
        }
        return (max);
    }
    
}
