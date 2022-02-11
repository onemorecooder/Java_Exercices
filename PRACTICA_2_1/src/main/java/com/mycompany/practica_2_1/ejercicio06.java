/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica_2_1;

/**
 *
 * @author ajose
 */
public class ejercicio06 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        /**
        * (0+1=1 / 1+1=2 / 1+2=3 / 2+3=5 / 3+5=8 / 5+8=13 / 8+13=21 / 13+21=34...)
        */
        
        int count = 10;
        int a=0, b=1, res = 1;
        
        for (int i = 0; i < count; i++){
            // HAREMOS USO DE UNA VARIABLE AUXILIAR PARA ROTAR LOS VALORES
            // DE LAS VARIABLES.
            System.out.print(res + " ");
            res = a + b;
            a = b;
            b = res;
        }
    }
    
}
