/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a = Math.random() * 2000001;

        int tiempo = (int) a;
        
        System.out.println("Segundos: " + tiempo);
        
        // PARA PASARLO A HORAS DIVIDIREMOS EL TIEMPO OBTENIDO ENTRE 3600.
        
        int horas = tiempo / 3600;
        
        // PARA PASAR EL TIEMPO A MINUTOS DIVIDIREMOS ENTRE 60 EL RESTO OBTENIDO DE LOS SEGUNDOS ENTRE 60.
        
        int mins = tiempo % 3600 / 60;
        
        // Y FINALMENTE PARA LOS SEGUNDOS EL RESTO DE LA VARIABLE TIEMPO.
        
        int secs = (tiempo % 3600) % 60;
        System.out.println(tiempo + " segundos son " + horas + ":" + mins + ";" + secs);
        
    }
    
}
