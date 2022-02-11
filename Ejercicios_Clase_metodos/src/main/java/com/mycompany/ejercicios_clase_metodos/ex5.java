/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_clase_metodos;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tu numerito");
        
        int numerito = sc.nextInt();
        
        numerito = doble(numerito);
        
        System.out.println(numerito);
        
    }
    
    public static int doble (int num){
        num = num * 2;
        return num;
    }
    
}
