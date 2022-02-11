/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1_nf1_exercices;

/**
 *
 * @author ajose
 */
public class exercice_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String dni = "200000000A";
        
        String numeros = dni.substring(0, dni.length()-1);
        String letras = dni.substring(dni.length()-1);
        
        System.out.println("DNI (num): " + numeros);
        System.out.println("DNI (letra) : " + letras);
        
        int numToInt = Integer.parseInt(numeros);
        
        int suma = numToInt + 20;
        
        System.out.println("El número del DNI ya es un Int: " + suma);
    }

}
