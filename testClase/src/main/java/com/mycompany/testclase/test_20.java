/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

/**
 *
 * @author ajose
 */
public class test_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Serie número: " + i);
            for(int j = 1; j<=5; j++){
                num = (int) (Math.random() * 11);
                System.out.println("Número: " + j + ": " + num);
            }
            
        }
        
    }
    
}
