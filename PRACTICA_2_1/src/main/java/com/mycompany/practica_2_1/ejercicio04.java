/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica_2_1;

/**
 *
 * @author ajose
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int dividendo, divisor;
        int cociente = 0;
        int res;
        dividendo = (int) (Math.random() * 91) + 10;
        divisor = (int) (Math.random() * 9) + 2;

        /* EL WHILE ES PARA QUE HAGA LAS RESTAS DE MANERA SUCESIVA MIENTRAS EL 
        DIVIDENDO SEA MAYOR QUE 0*/
        while (dividendo > 0) {
            res = dividendo - divisor;
            /* LE ASIGNAMOS A LA VARIABLE RES LA RESTA DEL DIVIDENDO Y EL DIVISOR
            PARA QUE COMPRUEBE QUE ES MAYOR QUE 0 EN EL SIGUIENTE CONDICIONAL.
            BÁSICAMENTE ES PARA QUE NUNCA NOS IMPRIMA UN RESULTADO NEGATIVO.*/
            if (res >= 0) {
                System.out.println(dividendo + " - " + divisor + " = " + res);
                /* AQUÍ HAREMOS LE DAMOS EL VALOR DE LA RESTA ENTRE DIVIDENDO Y DIVISOR A 
                DIVIDENDO.*/
                dividendo = dividendo - divisor;
                // UN CONTADOR PARA DECIR EL COCIENTE AL FINAL DEL PROGRAMA
                cociente++;
            } else {
                /* SI EL RESULTADO ES MENOR QUE CERO (NEGATIVO), HAREMOS UN BREAK PARA SALIR
                DEL BUCLE E IMPRIMIR EL COCIENTE.*/
                break;
            }
        }
        System.out.println("El cociente es: " + cociente);

    }

}
