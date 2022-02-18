/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ajose
 */
public class Athlete {
    
    private String ID;
    private String name;
    private int bib;
    private int age;
    public static int dorsal = 1000;
    
    /* CONSTRUCTOR COMPLETO */
    public Athlete (String ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.bib = dorsal++;
        this.age = age;
    }
    
    /* CONSTRUCTOR DE CAMPOS OBLIGATORIOS */
    public Athlete (String ID, String name){
        this.ID = ID;
        this.name = name;
        this.bib = dorsal++;
    }
    
    /* MÉTODO PARA SABER SI EL ATLETA ES MAYOR DE 50*/
    public static boolean isSenior (int age){
        boolean senior = false;
        if (age > 50){
            senior = true;
        }
        return senior;
    }
    
    // SETTERS //
    public void setID(String ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBib(int bib){
        this.bib = bib;
    }
    public void setAge(int age){
        this.age = age;
    }
        
    // GETTERS //
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public int getBib(){
        return bib;
    }
    public int getAge(){
        return age;
    }
}
