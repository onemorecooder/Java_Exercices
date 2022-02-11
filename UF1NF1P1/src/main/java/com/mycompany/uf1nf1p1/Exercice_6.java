/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1nf1p1;

/**
 *
 * @author ajose
 */
public class Exercice_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* GENERAMOS TRES VARIABLES ALEATORIAS
        PARA HACER REFERENCIA A LAS HORAS, LOS
        MINUTOS Y LOS SEGUNDOS.*/
        
        double a = Math.random() * 24;
        double b = Math.random() * 60;
        double c = Math.random() * 60;

        // PASAMOS A NUMERO ENTERO.
        
        int horas = (int) a;
        int minutos = (int) b;
        int segundos = (int) c;
        
        /* PARA PASAR LAS HORAS A MINUTOS LAS * 60
        PARA PASARLAS A MINUTOS, LUEGO OTRA VEZ PARA
        PASARLAS A SEGUNDOS, LO MISMO CON LOS MINUTOS
        Y FINALMENTE LO IMPRIMIREMOS.*/
        
        int horasMinutos = (horas * 60);
        int minutosSegundos = minutos * 60;
        int sumaTotal = (horasMinutos * 60) + minutosSegundos + segundos;
        
        if (horas < 10){
                    System.out.println("La hora generada es: 0" + horas + ":" + minutos + ";" + segundos);
        } else if (minutos <10){
                    System.out.println("La hora generada es: " + horas + ":0" + minutos + ";" + segundos);
        } else if (horas < 10){
                    System.out.println("La hora generada es: 0" + horas + ":" + minutos + ";" + segundos);
        } else if (segundos <10){
                    System.out.println("La hora generada es: " + horas + ":" + minutos + ";0" + segundos);
        } else if (horas < 10 && minutos <10 && minutos<10){
                    System.out.println("La hora generada es: 0" + horas + ":0" + minutos + ";0" + segundos);
        } else if (minutos <10 && segundos <10){
                    System.out.println("La hora generada es: " + horas + ":0" + minutos + ";0" + segundos);
        } else if (horas < 10 && minutos <10){
                    System.out.println("La hora generada es: 0" + horas + ":0" + minutos + ";" + segundos);
        } else if (horas <10 && segundos<10){
                    System.out.println("La hora generada es: 0" + horas + ":" + minutos + ";0" + segundos);
        }else{
                    System.out.println("La hora generada es: " + horas + ":" + minutos + ";" + segundos);
        }
        
        //System.out.println("La hora generada es: " + horas + ":" + minutos + ";" + segundos);
        System.out.println("Esta hora equivale a: " + sumaTotal + " segundos");

    }

}
