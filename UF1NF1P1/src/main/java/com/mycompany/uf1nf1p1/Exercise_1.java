/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercise_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CREACIÓN DE LAS VARIABLES ALEATORIAS
        
        double numero = Math.random()*50+1;
        double numero2 = Math.random()*50+1;
        
        // HACIENDO DE ESTAS VARIABLES NÚMEROS ENTEROS
        
        int a = (int)numero;
        int b = (int)numero2;
        
        // REALIZANDO LA OPERACIÓN DE SUMA
        
        int suma = a + b;
        System.out.println("La suma entre " + a + " y " + b + " es: " + suma);
        
        // REALIZANDO LA OPERACIÓN DE RESTA
        
        int resta = a - b;
        System.out.println("La resta entre " + a + " y " + b + " es: " + resta);
        
        // REALIZANDO LA OPERACIÓN DE MULTIPLICACIÓN
        
        int multi = a * b;
        System.out.println("La multiplicación entre " + a + " y " + b + " es: " + multi);
        
        // REALIZANDO LA OPERACIÓN DE DIVISIÓN
        
        int divi = a / b;
        System.out.println("La división entre " + a + " y " + b + " es: " + divi);
    }
    
}
