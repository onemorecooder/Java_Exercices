/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject2;


/**
 *
 * @author ajose
 */
import javax.swing.*;
import java.math.*;
public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        System.out.print(suma(1, 5));
        System.out.print(Math.PI);
        
        
          _ _ _ _ _ _ NO AFECTA AL DATO
        int y = 5;
        int z = 5;
        int num = 0;
        
        
        boolean noSi = false;
        boolean siNo = true;
        
        boolean siSi = noSi || siNo;
        System.out.println(siSi);
        
        if (siNo == true){
            System.out.println("la variable siNo es: " + siNo);
        }else{
            System.out.println("La variable siNo es: " + siNo);
        }
        
        String nombre = JOptionPane.showInputDialog("Cómo te llamas?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Hola que edad tienes?"));
        
        JOptionPane.showMessageDialog(null, "Hola " + nombre + " tienes " + edad + " años.");
        */
        
        
        /*
        do{
            num++;
            System.out.println("Contador: " + num);
        } while (num!=5);
        
        if (y == z){
            System.out.println(y+z);
        }
        for(int i = 0;i <= 10; i++){
            System.out.println("Contador: " + i);
        }
        
        */
        
        char matriz[][] = new char[3][3];
        
        for(int fila = 0; fila<matriz.length; fila++){
            for(int columna = 0; columna<matriz.length;columna++){
                matriz[fila][columna] = 'X';
                System.out.print(matriz[fila][columna]+ " ");
            }
            System.out.println();
        }
        
        int num1 = 0;
    
    do{
        num1++;
        System.out.println(num1);
    } while (num1< 10);
    }
    
    
    
    public static int suma (int i,int  x) {
    return i + x;
    
}
}
