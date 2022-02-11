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
public class test_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salida = false;
        int num;
        do {
            System.out.println("Pon un número del 0 al 10:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num > 10) {
                System.out.println("Has elegido el número: " + num);
                System.out.println("A ver si aprendemos a leer...");
                System.out.println("");
            } else {
                System.out.println("Has elegido el número: " + num);
                System.out.println("¡Bien, a jugar!");
                salida = true;
            }
        } while (!salida);

        System.out.println("Elige la operación que quieres hacer: ( +, -, *, / )");
        System.out.println("Introduce 1 para -> +.");
        System.out.println("Introduce 2 para -> -.");
        System.out.println("Introduce 3 para -> *.");
        System.out.println("Introduce 4 para -> /.");

        Scanner sc2 = new Scanner(System.in);
        int operacion = sc2.nextInt();
        int num1, num2, num3, num4, resultadosuma, resultadoresta, resultadodivi, resultadomulti;

        do {
            switch (operacion) {
                case 1:
                    do {
                        System.out.println("Juengo de las sumas:");
                        System.out.println("Elige un número para sumarlo al anterior:");
                        Scanner sc = new Scanner(System.in);
                        num1 = sc.nextInt();
                        System.out.println("Cuanto es " + num + " + " + num1 + "?");
                        resultadosuma = sc.nextInt();
                        if (resultadosuma == num + num1) {
                            System.out.println("Muy bien!");
                            System.out.println("La suma de " + num + " + " + num1 + " = " + resultadosuma);
                            break;
                        } else {
                            System.out.println("¡Respuesta incorrecta! Prueba otra vez.");
                        }
                    } while (num + num1 != resultadosuma);
                case 2: {
                    do {
                        System.out.println("Juengo de las restas:");
                        System.out.println("Elige un número para restarle al anterior:");
                        Scanner sc3 = new Scanner(System.in);
                        num2 = sc3.nextInt();
                        System.out.println("Cuanto es " + num + " - " + num2 + "?");

                        resultadoresta = sc3.nextInt();

                        if (resultadoresta == num - num2) {
                            System.out.println("Muy bien!");
                            System.out.println("La resta de " + num + " - " + num2 + " = " + resultadoresta);
                            break;
                        } else {
                            System.out.println("¡Respuesta incorrecta! Prueba otra vez.");
                        }
                    } while (num - num2 != resultadoresta);
                }
                case 3: {
                    do {
                        System.out.println("Juengo de las multiplicaciones:");
                        System.out.println("Elige un número para multiplicarlo al anterior:");
                        Scanner sc3 = new Scanner(System.in);
                        num3 = sc3.nextInt();
                        System.out.println("Cuanto es " + num + " * " + num3 + "?");

                        resultadomulti = sc3.nextInt();

                        if (resultadomulti == num * num3) {
                            System.out.println("Muy bien!");
                            System.out.println("La multilpicación de " + num + " * " + num3 + " = " + resultadomulti);
                            break;
                        } else {
                            System.out.println("¡Respuesta incorrecta! Prueba otra vez.");
                        }
                    } while (num * num3 != resultadomulti);
                }
                case 4: {
                    do {
                        System.out.println("Juengo de las divisiones:");
                        System.out.println("Elige un número para dividirlo al anterior:");
                        Scanner sc3 = new Scanner(System.in);
                        num4 = sc3.nextInt();
                        System.out.println("Cuanto es " + num + " / " + num4 + "?");

                        resultadodivi = sc3.nextInt();

                        if (resultadodivi == num * num4) {
                            System.out.println("Muy bien!");
                            System.out.println("La división de " + num + " / " + num4 + " = " + resultadodivi);
                            break;
                        } else {
                            System.out.println("¡Respuesta incorrecta! Prueba otra vez.");
                        }
                    } while (num / num4 != resultadodivi);
                }
                default:
                    break;
            }
        } while (operacion != 1 || operacion != 2 || operacion != 3 || operacion != 4);

    }
}
