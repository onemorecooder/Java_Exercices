/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIOS;

/**
 *
 * @author ajose
 */
public class ATLETA {
    
    int dorsal;
    int edad;
    String nombre;
    char genero;
    
    public ATLETA(int dorsal, int edad, String nombre, char genero) {
        this.dorsal = dorsal;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    // VARIABLES DE INSTANCIA
    public char getGenero() {
        return genero;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}

