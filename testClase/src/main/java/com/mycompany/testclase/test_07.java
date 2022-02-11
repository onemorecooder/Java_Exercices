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
public class test_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        
        System.out.println("Introduce el primer número:");
        int num1 = a.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = b.nextInt();
        System.out.println("Introduce el tercer número:");
        int num3 = c.nextInt();
        
        // SI NÚMERO 1 ES EL MAYOR
        
        if(num1 > num2 && num1 > num3){
            System.out.print(num1 + " ");
                if (num2>num3){
                    System.out.println(num2 + " " + num3);
                } else{
                    System.out.println(num3 + " " + num2);
                }
            }
        
        if(num2 > num1 && num2 > num3){
            System.out.print(num2 + " ");
                if(num1 > num3){
                    System.out.println(num1 + " " + num3);
                }else{
                    System.out.println(num3 + " " + num1);
                }
        }
        
        if(num3 > num2 && num3 > num1){
            System.out.print(num3 + " ");
                if(num1 > num2){
                    System.out.println(num1 + " " + num2);
                }else{
                    System.out.println(num2 + " " + num1);
                }
        }
        
        
        
        System.out.println("");
                
    }
    
}
