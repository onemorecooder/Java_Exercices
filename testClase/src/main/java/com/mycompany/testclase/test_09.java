/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class test_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        int diaHoy = 25;
        int mesHoy = 12;
        int yearHoy = 2021;

        System.out.println("Programa para saber si la fehca introducida\ncoincide con la fecha definida.");
        System.out.println("La fecha de hoy es: " + diaHoy + "/" + mesHoy + "/" + yearHoy + "\n");

        System.out.println("Introduzca el día:");

        int dia = a.nextInt();
        if (dia > 31 || dia < 1) {
            System.out.println("Introduce un día válido!");
            System.out.println("Vuelve a introducir el día:");
            dia = a.nextInt();
        }
        int mes;

        do {
            System.out.println("Introduce el mes:");
            mes = b.nextInt();
            if (dia > 28 && mes == 2 || dia > 30 && mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Eso no puede ser mongolo");
            }
        } while (dia > 28 && mes == 2 || dia > 30 && mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12);
        int year;

        do {
            System.out.println("Introduce el año (4dígitos):");
            year = c.nextInt();
            if (year <= 1000) {
                System.out.println("Jajajaja a dónde vas tan lejos...");
            }
        } while (year < 1000);
        
        
        System.out.println(" ");
        System.out.println("La fecha introducida es: " + dia + "/" + mes + "/" + year);

        if (dia != diaHoy || mes != mesHoy || year != yearHoy) {
            System.out.println("La fecha introducida NO coincide con la fecha de hoy.");
        } else {
            System.out.println("La fecha introducida SI coincide con la fecha de hoy.");
        }

    }

}
