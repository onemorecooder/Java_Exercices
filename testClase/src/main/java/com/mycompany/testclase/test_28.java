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
public class test_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
        int contadorCuatro = 0;
        System.out.println("Introduce las veces que quieres que se repita el bucle:");
        Scanner sc = new Scanner(System.in);
        int largoFor = sc.nextInt();
        
        for (int i = 0; i < largoFor; i++){
            System.out.print("Hola Alejandro. ");
            contador++;
            System.out.println("El bucle se ha ejecutado " + contador + " veces.");
            
            if (contador == 4){
                contadorCuatro++;
                System.out.println("Ha salido un 4");
            }
        }
        
        System.out.println(contador + ":" +  contadorCuatro);
        
    }
    
}
