/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // CREAMOS UNA VARIABLE ALEATORIA QUE IMPRIMA UN NÚMERO DE 100 A 900.
        double a = Math.random()* 900 + 100;

        // LA CONVERTIMOS EN UN ENTERO.
        int numero = (int) a;
        
        System.out.println(numero);
        
        
        // BÁSICAMENTE TENEMOS QUE IR ACUMULANDO EL NÚMERO
        
        // CASO: EL ALEATORIO DA 864.
        
        // AQUÍ DIVIDIMOS EL ALEATORIO ENTRE 100 QUE SERÍA 8,64 AL PASARLO A ENTERO NOS QUEDAMOS CON EL 8.
        int num1 =  (int)numero /100 ;
        System.out.println("numero 1: "+ num1);
        
        // AQUÍ MULTIPLICAMOS EL NUMERO 1 * 100 PARA RESTARSELO AL ALEATORIO 8* 100 = 800 // 864 - 800 = 64 
        // DESPUÉS ESTE 64 LO DIVIDIMOS ENTRE 10 PARA LLEGAR AL 6,4, QUE AL PASARLO A ENTERO NOS QUEDA 6.
        int num2 =  (int)(numero - num1*100)/10 ;
        System.out.println("numero 2: "+ num2);
        
        // FINALMENTE LO MISMO ESE 800 SE LO RESTAMOS AL NÚMERO ALEATORIO (864) QUE QUEDA EN 64.
        // A ESTE 64 LE RESTAMOS EL NÚMERO EL NÚMERO 2 * 10 // 6 * 10 = 60 Y AL 64 LE RESTAMOS LOS 60
        // NOS QUEDARÁ EL 4 Y YA TENDREMOS LOS TRES NÚMERO SEPARADOS.
        int num3 =  (numero - num1 * 100) - num2 * 10;
        System.out.println("numero 3: "+ num3);
        
        
        
        /////////////////// USANDO CHARAT ///////////////////
        
        // IMPRIMIMOS EL VALOR DE NUESTRO NUMERO EN INT.
        //System.out.println("Número int: " + numero);
        
        // HACEMOS DE NUESTRO ENTERO UNA CADENA DE TEXTO.
        //String cadena = String.valueOf(numero);
        
        /* CON EL USO DE CHARAT DECIDIREMOS QUE CARACTER
        DE LA CADENA QUEREMOS MOSTRAR, EN ESTE CASO EL VALOR
        DE LA POSICION 0, 1 Y 2 DE NUESTRA CADENA DE TEXTO,
        MOSTRANDO ASÍ UNO POR UNO EL NÚMERO.*/
        //System.out.println("El primer número es: " + cadena.charAt(0));
        //System.out.println("El segundo número es: " + cadena.charAt(1));
        //System.out.println("El tercer número es: " + cadena.charAt(2));
    }
    
}
 