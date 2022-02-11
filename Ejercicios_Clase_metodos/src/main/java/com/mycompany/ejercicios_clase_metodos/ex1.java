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
public class ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        num = sc.nextInt();
        
        System.out.println("-----------------------");
        show(num);
        System.out.println("-----------------------");
    }
    
    public static void show (int numFunction){
        for (int  i= 1 ; i <= numFunction; i++){
            System.out.println("- " + i + ": Module running!");
        }
    }
    
}
