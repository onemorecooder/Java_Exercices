/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_alejandro;

/**
 *
 * @author ajose
 */
public class exercice_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a = Math.random()* 89999 + 10000;

        // LA CONVERTIMOS EN UN ENTERO.
        int numero = (int) a;
        // IMPRIMIMOS NÚMER GENERADO
        System.out.println(numero);
        
        
        // PARA SACAR EL PRIMER NÚMERO DIVIDIMOS ESTE ENTRE 10000
        // 45678 / 10000 = 4
        int num1 =  (int)numero /10000 ;
        System.out.println("numero 1: "+ num1);
        
        // SEGUNDO NÚMERO ENTRE 1000 Y DESPUÉS LE RESTAREMOS EL PRIMERO *10
        // 45678 / 1000 = 45
        // 45 - 4 * 10 = 5
        // SEGUIREMOS ESTE PROCESO HASTA FINALIZAR CON TODOS LOS NÚMEROS
        int num2 =  (int)(numero /1000)-num1*10 ;
        System.out.println("numero 2: "+ num2);
        
        int num3 =  (int)((numero /100)-num1*100)-num2*10 ;
        System.out.println("numero 3: "+ num3);
        
        int num4 =  (int)(((numero /10)-num1*1000)-num2*100)-num3*10;
        System.out.println("numero 4: "+ num4);
        
        int num5 =  (int)((((numero)-num1*10000)-num2*1000)-num3*100)-num4*10;
        System.out.println("numero 5: "+ num5);
        
    }
    
}
