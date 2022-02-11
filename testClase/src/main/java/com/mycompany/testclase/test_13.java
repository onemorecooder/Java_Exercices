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
public class test_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            System.out.println("Número introducido: " + num);
            if (num < 0 ){
                System.out.println(num + " es un número negativo");
            }else if (num > 0){
                System.out.println(num + " es un número positivo");
            } else{
                System.out.println(num + " es " + num + ", hasta la próxima.");
            }
        }while(num != 0);
    }
    
}
