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
public class test_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 0, b = 0, c = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número a: ");
        a = sc.nextInt();
        System.out.println("Número b: ");
        b = sc.nextInt();
        System.out.println("Número c: ");
        c = sc.nextInt();
        
        double resultado = (-b + (Math.sqrt(b*b - 4 * a * c))) / (2 * a);
        double resultado2 = (-b - (Math.sqrt(b*b - 4 * a * c))) / (2 * a);
        double condicion = (b * 2)- (4 * a * c);
        
        if (condicion < 0){
            System.out.println("No tiene solucion");
        } else if (condicion == 0){
            System.out.println("Resultado único: " + resultado);
        } else {
            System.out.println("Resuldado doble");
            System.out.println("Resultado 1: " + resultado);
            System.out.println("Resultado 2: " + resultado2);
        }
    }
    
}
