/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contar = 0;
        int numero = 3;
        boolean igual = false;

        /* CREAMOS UN BUCLE WHILE PARA DECIRLE QUE
        MIENTRAS QUE LA VARIABLE CONTAR QUE EMPIEZA
        CON VALOR = 0 SEA MENOR QUE 5 NOS DIGA SI 
        EL NUMERO ES = A 3 O NO, PARA ELLO USAREMOS
        UNA VARIABLE BOOL PARA DECIRLE QUE SEA TRUE
        EN EL CASO DE QUE SEA 3 O FALSE EN EL CASO DE 
        QUE SEA DIFERENTE A 3. USANDO UN CONDICIONAL
        IF ELSE. */
                
        while (contar <= 5) {
            if (contar == numero) {
                igual = true;
                System.out.println(igual);
            } else {
                igual = false;
                System.out.println(igual);
            }
            contar++;
        }
    }
}
