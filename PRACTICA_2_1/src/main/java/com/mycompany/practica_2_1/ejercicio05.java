/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica_2_1;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma, multiplos, resto, perfect = 0;

        for (int i = 1; perfect < 3; i++) {
            //REINICIAMOS SUMA PARA CADA VUELTA
            suma = 0;
            /* GUARDAMOS EN LA VARIABLE MÚLTIPLOS LA MITAD DEL NÚMERO QUE
                SE INCREMENTA YA QUE LOS MÚLTIPLOS DE UN NÚMERO SIEMPRE
                ESTARÁN EN LA PRIMERA MITAD DEL MISMO.
            */
            multiplos = i / 2;
            
            for (int j = 1; j <= multiplos; j++) {
                /* CALCULAMOS EL RESTO DEL NUMERO QUE SE INCREMENTA ENTRE LA 
                    VARIABLE J QUE LLEGARÁ HASTA LA MITAD QUE COMENTÉ ANTES
                */
                resto = i % j;
                
                // SI EL NÚMERO ES DIVISOR SE SUMAN Y SE ACUMULAN.
                if (resto == 0) {
                    suma = suma + j;
                }
            }

            // SI LA SUMA ES IGUAL AL NÚMERO QUE SE INCREMENTA ES PERFCTO.
            if (suma == i) {
                System.out.println("PERFECT: " + i);
                perfect++;
            }
        }
    }
}
