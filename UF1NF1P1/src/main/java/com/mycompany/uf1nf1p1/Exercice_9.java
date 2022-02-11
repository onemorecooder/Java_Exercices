/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int sobrante;
        
        // GENERAMOS UN NUMERO ALEATORIO DE 0.1 A 4,9
        double dinero = Math.random() * 4.9 + 0.1;
        // REDONDEAMOS LA VARIABLE DE DINERO A 2 DECIMALES
        dinero = (int)(dinero*100);
        dinero = (double)(dinero/100);
        System.out.println("Dinero: " + dinero);
        System.out.println("");
        
        /* UNA VEZ IMPRESO EL DINERO CON DECIMALES LO PASAMOS A CÉNTIMOS
        PARA ASÍ PODER HACER LOS CAMBIOS Y LAS OPERACIONES SIN TENER ESAS
        PÉRDIDAS DE CÉNTIMOS TAN MOLESTAS :D*/
        
        dinero = (int)(dinero*100);
        
        //System.out.println(dinero);
        
        // DEFINIMOS EL VALOR DE TODAS LAS MONEDAS EN CÉNTIMOS
        
        int dosEur = 200, unEur = 100, cincuentaCent = 50, veinteCent = 20, diezCent = 10, cincoCent = 5, dosCent = 2, unCent = 1;
        
        // HACEMOS LAS OPERACIONES PARA VER A CUANTAS MONEDAS ABARCAMOS 
        // Y USAMOS EL MÓDULO % OARA SABER CUANTO DINERO NOS QUEDA, ASÍ CON TODAS.
        
        dosEur = (int)(dinero/200);
        sobrante = (int)dinero%200;
        System.out.println("Monedas de 2€ usadas: " + dosEur);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        unEur = (int)(sobrante/100);
        sobrante = (int)sobrante%100;
        System.out.println("Monedas de 1€ usadas: " + unEur);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        cincuentaCent = (int)(sobrante/50);
        sobrante = (int)sobrante%50;
        System.out.println("Monedas de 0,50€ usadas: " + cincuentaCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        veinteCent = (int)(sobrante/20);
        sobrante = (int)sobrante%20;
        System.out.println("Monedas de 0,20€ usadas: " + veinteCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        diezCent = (int)(sobrante/10);
        sobrante = (int)sobrante%10;
        System.out.println("Monedas de 0,10€ usadas: " + diezCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        cincoCent = (int)(sobrante/5);
        sobrante = (int)sobrante%5;
        System.out.println("Monedas de 0,05€ usadas: " + cincoCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        dosCent = (int)(sobrante/2);
        sobrante = (int)sobrante%2;
        System.out.println("Monedas de 0,02€ usadas: " + dosCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");
        
        unCent = (int)(sobrante/1);
        sobrante = (int)sobrante%1;
        System.out.println("Monedas de 0,01€ usadas: " + unCent);
        //System.out.println("Dinero sobrante: " + sobrante + " céntimos.");

    }

}
