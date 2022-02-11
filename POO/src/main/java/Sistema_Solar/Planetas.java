/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Solar;

/**
 *
 *  massa, densitat, diàmetre, distància al sol, un
número d'identificador i un nom textual.
 */
public class Planetas {
    
    private int id;
    private String name;
    private double mass;
    private double dens;
    private double dist_sol;
    
    // ******************* INICIO GETTERS ******************* //
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public double getMass(){
        return mass;
    }
    
    public double getDens(){
        return dens;
    }
    
    public double getDist_sol(){
        return dist_sol;
    }
    // ******************* FIN GETTERS ******************* //
    
    // *************************************************** //
    
    // ******************* INICIO SETTERS **************** //
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMass(double mass){
        this.mass = mass;
    }
    
    public void setDens(double dens){
        this.dens = dens;
    }
    
    public void setDist_sol(double dist_sol){
        this.dist_sol = dist_sol;
    }
    // ******************* FIN SETTERS **************** //
    
    
    // ******** INICIANDO TODOS LOS VALORES *********** //
    public Planetas(int id, String name, double mass, double dens, double dist_sol) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.dens = dens;
        this.dist_sol = dist_sol;
    }
    
    // ******** INICIANDO ALGUNOS DE LOS VALORES *********** //
    public Planetas(int id, String name, double mass) {
        this.id = id;
        this.name = name;
        this.mass = mass;
    }
    
    
}
