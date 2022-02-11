/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* CREAMOS LAS VARIABLES ALEATORIAS PARA 
        CRAR EL PRECIO DEL PRODUCTO Y EL DESCUENTO
        QUE VA A TENER.*/
        
        double a = Math.random() * 101;
        double b = Math.random()*41 + 10;

        // VALOR A NUESTRA CARTERA.
        
        int cartera = 100;
        
        // PASAMOS A ENTERO LAS VARIABLES ALEATORIAS.
        
        int precio = (int) a;
        int descuento = (int) b;
        
        /* PARA CALCULAR EL DESCUENTO QUE VAMOS A TENER
        HAREMOS UNA REGLA DE 3*/
        
        int descuentoFinal = (precio * descuento) / 100;
        
        /* PARA VER EL PRECIO FINAL RESTAREMOS AL PRECIO DEL 
        PRODUCTO EL DESCUENTO SACADO DE LA OPERACIÓN
        ANTERIOR.*/
        
        int precioFinal = precio - descuentoFinal;
        
        /* LO QUE NOS QUEDA LO HAREMOS RESTANDO EL PRECIO
        CON EL DESCUENTO A NUESTRA CARTERA*/
        
        int resto = cartera - precioFinal;
        
        // IMPRIMIMOS TODOS LOS DATOS
        
        System.out.println("Tiene un precio de: " + precio + "€.");
        System.out.println("Descuento del: " + descuento + "%.");
        System.out.println("Ha tenido un descuento de: "+ descuentoFinal + "€.");
        System.out.println("Su precio final será de: " + precioFinal + "€.");
        System.out.println("Así pues, te quedan " + resto + "€ en la cartera.");
        
    }
    
}
