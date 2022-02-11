/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testclase;
import java.util.Scanner;
import javax.swing.*;
import java.math.*;

/**
 *
 * @author ajose
 */
public class test_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Indica el radio de la circunferéncia:");
        Scanner a = new Scanner(System.in);
        int radio = a.nextInt();
        double area = Math.pow(Math.PI * radio, 2);
        System.out.println("El area de la circunferéncia es: " + area);        
    }
}
