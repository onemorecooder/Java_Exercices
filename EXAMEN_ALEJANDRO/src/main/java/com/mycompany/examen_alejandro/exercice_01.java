/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen_alejandro;

/**
 *
 * @author ajose
 */
public class exercice_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero = Math.random()*30+1;
        int radi = (int)(numero*100)/100;
        System.out.println("Radio: " + radi);
        
        double volum;
        double cubo = (radi * radi)*radi;
        
        // MATH.PI PARA MULTIPLICARLO POR 3,1415.....
        // MATH.POW PARA ELEVAR UN DOUBLE AL SIGUIENTE NÚMERO QUE SE LE INDIQUE DENTRO DEL PARÉNTESIS
        // LO HE COMENTADO DE LA OTRA MANERA YA QUE CON POW ES MÁS VISUAL.
        volum = (4 * Math.PI * Math.pow(radi, 3)/3);
        double volum2 = (4 * Math.PI * cubo/3);
        System.out.println("Volumen es: " + volum);
        System.out.println(""+ volum2);
        int enteroVolum = (int)volum;
        System.out.println("La parte entera de volum es: " + enteroVolum);
        
        
        // PARA SABER EL VALOR DE LOS DECIMALES LE RESTAMOS LA PARTE ENTERA
        double decimalVolum = volum - enteroVolum;
        System.out.println("La parte decimal de volum es: " + decimalVolum);
        
    }
    
}
