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
public class test_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        
        System.out.println("Introduzca el primer número:");
        int num1 = a.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = b.nextInt();
        
        if (num1 == num2){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println("Los números son diferentes.");
        }
    }
    
}
