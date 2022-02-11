/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean aprobar = true;
        
        // CREACIÓN DE TODAS LAS VARIABLES ALEATORIAS.

        double a = Math.random() * 10 + 1;
        int nota1 = (int) a;
        double b = Math.random() * 10 + 1;
        int nota2 = (int) b;
        double c = Math.random() * 10 + 1;
        int nota3 = (int) c;
        double d = Math.random() * 10 + 1;
        int nota4 = (int) d;
        double e = Math.random() * 10 + 1;
        int nota5 = (int) e;

        // IMPRIMIMOS LAS VARIABLES QUE AHORA SON ENTERAS.
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Nota 5: " + nota5 + "\n");

        /* REALIZAMOS LA OPERACIÓN PARA SACAR LA MEDIA
        SERÁ LA SUMA DE LAS NOTAS DIVIDIDA ENTRE EL NÚMERO 
        TOTAL DE NOTAS Y LA IMPRIMIMOS.*/
        
        int media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.println("La nota media es de: " + media + "\n");

        /* A CONTINUACIÓN LE DECIMOS CON UN CONDICIONAL
        QUE SI LA NOTA MEDIA ES MENOR A 5 ESTA ADQUIERA
        EL VALOR BOOL DE FALSO Y LO IMPRIMA.
        EN EL ELSE JUSTAMENTE EL CASO CONTRARIO.*/
        
        if (media < 5) {
            aprobar = false;
            System.out.println("La media de todas las notas es (true aprobada, false suspendida):  " + aprobar);
        } else {
            System.out.println("La media de todas las notas es (true aprobada, false suspendida):  " + aprobar);

        }
    }

}
