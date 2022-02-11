package com.mycompany.practica_2_1;
public class ejercicio03 {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 100) {
            // IMPRIMIREMOS LOS IMPARES Y LOS QUE NO SON
            // DIVISIBLES ENTRE 7.
            if (num % 7 != 0 && num %2 != 0){
                System.out.print(num + " ");
            }
            num++;
        }        
    }
}