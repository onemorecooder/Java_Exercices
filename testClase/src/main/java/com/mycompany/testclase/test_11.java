/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

/**
 *
 * @author ajose
 */
public class test_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double media = 0;
        int nota = 0;
        
        int [] a = new int[10];
        
        for(int i = 0; i < a.length; i++){
            nota = (int)(Math.random()*11);
            a[i] = nota;
        }
        
            // FOREACH: BUCLE FOR ABREVIADO, SE UTILIZA PARA
            // LEER ARRAYS SIN LA NECESIDAD DE GUARDAR
            // LAS POSICIONES.
            
                for(int aux : a){
                    media += aux;
                    System.out.println("Nota: " + aux);
        }
                
        /*
        for(int j = 0; j < a.length; j++){
            System.out.print("Nota nº"+ (j+1) + ": " +  a[j]);
            System.out.print(" ");
            media = media + a[j];
            System.out.println("suma: " + media);
        }
        */
        
        media = media/a.length;
        System.out.println("Media: " + media);
        
    }
    
}
