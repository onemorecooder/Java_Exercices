/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */

public class Exercice_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double a = Math.random() * 50 + 1;
        double b = Math.random() * 50 + 1;
        //int a = (int) numero;
        //int b = (int) numero2;

        
        
        /* LAs SIGUIENTEs OPERACIÓNES SON TODAS IGUALES
         RESALTADO EL MÉTODO MATH.POW
         QUE SE UTILIZA PARA ELEVAR UNA VARIABLE AL 
         NÚMERO QUE NOSOTROS DECIDAMOS. 
        
        EL RESTO ES OBVIO, SUMAS, RESTAS, MULTIPLICACIONES...
        
        a + b ^2 * 2 / (a - b ).

        IMPRIMIREMOS UNA POR UNA LAS OPERACIONES EN ORDEN
        DE PRIORITARIO COMO SE INDICA A CONTINUACIÓN.
        
        PARA REDONDEAR UTILIZAREMOS LA SIGUIENTE OPERACIÓN
        parentesis = (int)(parentesis*100)/100.0;
        */
        a = (int)(a * 100)/100.0;
        b = (int)(b * 100)/100.0;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        
        double parentesis = (a - b);
        parentesis = (int)(parentesis*100)/100.0;
        System.out.println("Primero haremos el paréntesis: " + a + " - " + b + " = " + parentesis + ".");
        
        double elevado = Math.pow(b, 2);
        elevado = (int)(elevado*100)/100.0;
        System.out.println("En segundo lugar elevaremos el número al cuadrado: " + b + " ^2 = " + elevado + ".");
        
        
        double multiplicacion = elevado * 2;
        multiplicacion= (int)(multiplicacion*100)/100.0;
        System.out.println("En tercer lugar haremos la multiplicación: " + elevado + " * 2 " + " = " + multiplicacion + ".");
        
        
        double division = multiplicacion / parentesis;
        division = (int)(division*100)/100.0;
        System.out.println("En cuarto lugar la división: " + multiplicacion + " / " + parentesis + " = " + division + ".");
        
        
        double suma = a + division;
        suma = (int)(suma*100)/100.0;
        System.out.println("En último lugar haremos la suma: " + a + " + " + division + " = " + suma + ".");        
    }

}
