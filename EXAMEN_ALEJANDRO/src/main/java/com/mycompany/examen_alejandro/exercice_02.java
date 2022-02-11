/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_alejandro;

/**
 *
 * @author ajose
 */
public class exercice_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Genera dos nombres enters aleatoris, a i b, entre 0 i 100. Mostra “true” per
        consola si a és inferior a 50 i b superior a 20 i “false” en qualsevol altre cas.
        No pots utilitzar sentències “if” ni “switch”. El programa ha de donar la
        següent sortida per consola:*/
        
        boolean resultado;
        
        double randNum1 = Math.random()*101;
        int a = (int)(randNum1*100)/100;
        
        double randNum2 = Math.random()*30+1;
        int b = (int)(randNum2*100)/100;
        // UNA VEZ LO HEMOS PASADO A NÚMEROS ENTEROS LOS IMPRIMIMOS
        System.out.println("Valor a: " + a);
        System.out.println("Valor b: " + b);
        
        
        /* SI EL VALOR DE A ES MENOR QUE 50 ''''Y'''' && EL VALOR DE B ES MAYOR QUE 20
            MARCAMOS LA VARIABLE BOOLEANA COMO CORRECTA E IMPRIMIMOS */
        if (a < 50 && b > 20){
            resultado = true;
            System.out.println("a es menor que 50 y b es mayor que 20: " + resultado);
        } else {
            resultado = false;
            System.out.println("a es menor que 50 y b es mayor que 20: " + resultado);
        }
        
    }
    
}
