/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_alejandro;

/**
 *
 * @author ajose
 */
public class exercice_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double randNum1 = Math.random()*21+20;
        int a = (int)(randNum1);
        // CREAMOS D2 BOOL PARA DECLARARLOS COMO TRUE EN EL CASO DE QUE SE CUMPLA LA CONDICION DEL IF Y FALSE EN EL CASO CONTRARIO
        boolean par;
        boolean impar;
        
        // IMPRIMIMOS VALOR
        System.out.println("El valor de a es: " + a);
        
        /* USAREMOS UN CONDICIONAL PARA CONOCER
            SI EL NÚMERO ES PAR  O IMPAR
            UTILIZANDO LA SIGUIENTE FÓRMULA*/
        if ( a%2 == 0){
            
            /* AL CUMPLIRSE LA CONDICIÓN LE DECIMOS QUE PAR ES TRUE E IMPAR FALSE
                ACTO SEGUIDO IMPRIMIMOS, SEGUIREMOS EL MISMO PROCESO EN EL CASO OPUESTO*/
            par = true;
            impar = false;
            System.out.println("El número " + a + " es par: " + par);
            System.out.println("El número " + a + " es impar: " + impar);
        } else {
            impar = true;
            par = false;
            System.out.println("El número " + a + " es par: " + par);
            System.out.println("El número " + a + " es impar: " + impar);
        }
    }
    
}
