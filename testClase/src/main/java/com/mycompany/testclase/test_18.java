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
public class test_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        for (int i = 1; i <= 15; i++){
            System.out.println("Número " + i + ":");
            num = sc.nextInt();
            suma = suma + num;
        }
        System.out.println("El resultado total es: " + suma);
    }
    
}
