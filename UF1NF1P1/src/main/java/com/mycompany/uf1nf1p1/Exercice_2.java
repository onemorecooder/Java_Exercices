/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* NECESITAREMOS UNA VARIABLE AUXILIAR
        PARA PODER GUARDAR EL VALOR DE UNA
        DE LAS DOS VARIABLES Y ASÍ NO PERDERLA.*/ 
                
        char a = 'A';
        char b = 'B';
        char c;
        
        // EL VALOR DE C ES = 'A'.
        
        c = a;
        
       // EL VALOR DE A = 'B'.
        
        a = b;
        
        /* EL VALOR DE B = 'A'. YA QUE PASA
        A TENER EL VALOR QUE SE HA GUARDADO
        EN LA VARIABLE C.*/ 
        
        b = c;
        
        System.out.println("El valor de a es: " + a + " y el valor de b es: " + b);
    }
    
}
