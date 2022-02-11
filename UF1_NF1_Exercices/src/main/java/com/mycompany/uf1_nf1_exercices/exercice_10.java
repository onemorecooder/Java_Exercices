/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1_nf1_exercices;

/**
 *
 * @author ajose
 */
public class exercice_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double galon = 1;              // 1 GALON ------- 3,7854
        double litro = 3.7854;         // 79.7 GALONES ------ X
        double numeroAConvertir = 4;
        
        double x = numeroAConvertir*litro/galon; // 79.7 * 3,7854 / 1 = X
        System.out.println("- " + numeroAConvertir + " Galones son: " + x + " litros.");
        
        if(x>50){
            System.out.println("- Hay más de 50 L.");
        } else {
            System.out.println("- Hay menos de 50 L.");
        }
    }
}
