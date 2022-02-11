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
public class test_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Programa para saber si el número \n introducido es positivo o negativo.");
        System.out.println("Introduce un número.");
        int num = a.nextInt();
        
        if(num < 0){
            System.out.println("El número introducido es negativo.");
        }else if ( num == 0){
            System.out.println("El número introducido es cero (0).");
        }else {
            System.out.println("El número introducido es positivo.");
        }
        
    }
    
}
