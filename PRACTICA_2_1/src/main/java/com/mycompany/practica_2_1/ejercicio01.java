/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica_2_1;

/**
 *
 * @author ajose
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int dias = (int) (Math.random() * 31) + 1;
        System.out.println("El día de nacimiento es: " + dias + ".");
        int mes = (int) (Math.random() * 12) + 1;
        System.out.println("El mes de nacimiento es: " + mes + ".");
        // VARIABLE BOOLEANA PARA COMPROBAR QUE EL MES HA SIDO CORRECTO.
        boolean fecha = true;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            // YA QUE EL RANGO VA DE 1 A 31 SI LOS MESES INDICADOS EN EL CONDICINAL SALEN, 
            // LA FECHA SERÁ CORRECTA.
            System.out.println(dias + "/" + mes + " -- FECHA CORRECTA --");
        } else if (mes == 2 && dias <= 28) {
            // CREAMOS ESTE CONDICIONAL EXCLUSIVAMENTE PARA FEBRERO.
            System.out.println(dias + "/" + mes + " -- FECHA CORRECTA --");
        } else if (dias <= 30) {
            // QUITANDO LOS MESES DEL PRIMER CONDICIONAL, (LOS QUE TIENEN 30 DIAS), SE CREA ESTE CONDICIONAL
            // PARA DECIR QUE LOS MESES DE 30 DIAS SON CORRECTOS.
            System.out.println(dias + "/" + mes + " -- FECHA CORRECTA --");
        } else {
            // EN CUALQUIER OTRO CASO, LA FECHA SERÁ INCORRECTA.
            System.out.println("Fecha incorrecta.");
            fecha = false;
        }
        if (fecha == true) {
            // SE CREA UN BOOLEANO PARA COMPROBAR QUE LA FECHA HA SIDO CORRECTA, 
            // EN CASO POSITIVO ACTIVAMOS EL SWITCH, SI HUBIERA SIDO FALSE, NO.
            switch (mes) {
                // EN EL SWITCH SE IMPRIME EL SIGNO QUE HAYA TOCADO EN EL RANGO INDICADO.
                case 1:
                    // Enero
                    if (dias >= 21) {
                        System.out.println("Acuario");
                    } else {
                        System.out.println("Capricornio");
                    }
                    break;
                case 2:
                    // Febrero
                    if (dias >= 21) {
                        System.out.println("Piscis");
                    } else {
                        System.out.println("Acuario");
                    }
                    break;
                case 3:
                    // Marzo
                    if (dias >= 21) {
                        System.out.println("Aries");
                    } else {
                        System.out.println("Piscis");
                    }
                    break;
                case 4:
                    // Abril
                    if (dias >= 21) {
                        System.out.println("Tauro");
                    } else {
                        System.out.println("Aries");
                    }
                    break;
                case 5:
                    // Mayo
                    if (dias >= 21) {
                        System.out.println("Géminis");
                    } else {
                        System.out.println("Tauro");
                    }
                    break;
                case 6:
                    // Junio
                    if (dias >= 21) {
                        System.out.println("Cáncer");
                    } else {
                        System.out.println("Géminis");
                    }
                    break;
                case 7:
                    // Julio
                    if (dias >= 21) {
                        System.out.println("Leo");
                    } else {
                        System.out.println("Cáncer");
                    }
                    break;
                case 8:
                    // Agosto
                    if (dias >= 21) {
                        System.out.println("Virgo");
                    } else {
                        System.out.println("Leo");
                    }
                    break;
                case 9:
                    // Septiembre
                    if (dias >= 21) {
                        System.out.println("Libra");
                    } else {
                        System.out.println("Virgo");
                    }
                    break;
                case 10:
                    // Octubre
                    if (dias >= 21) {
                        System.out.println("Escorpio");
                    } else {
                        System.out.println("Libra");
                    }
                    break;
                case 11:
                    // Noviembre
                    if (dias >= 21) {
                        System.out.println("Sagitario");
                    } else {
                        System.out.println("Escorpio");
                    }
                    break;
                case 12:
                    // Diciembre
                    if (dias >= 21) {
                        System.out.println("Capricornio");
                    } else {
                        System.out.println("Sagitario");
                    }
                    break;
            }
        }
    }
}
