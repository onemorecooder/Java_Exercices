/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author ajose
 */
public class Race {
    
    private String codeRace;
    private String Location;
    private int distance;
    private LocalDateTime dateTime;
    /*DECLARAMOS EL ARRALYST QUE GUARDARÁ A LOS ATLETAS QUE ESTÉN REGISTRADOS
    EN ESA CARRERA*/
    private ArrayList<Athlete> raceAthletes;
    
    /*CONSTRUCTOR PARA CREAR UNA CARRERA*/
    public Race(String codeRace, String Location, int distance){
        this.codeRace = codeRace;
        this.Location = Location;
        this.distance = distance;
        this.dateTime = LocalDateTime.now();
        raceAthletes = new ArrayList<>();
    }
    
    /*GETTERS*/
    public String getCodeRace(){
        return codeRace;
    }
    
    public String getLocation(){
        return Location;
    }
    
    public int getDistance(){
        return distance;
    }
    
    public LocalDateTime getDateTime(){
        return dateTime;
    }
    
    public ArrayList<Athlete> getRaceAthletes(){
        return raceAthletes;
    }
    
    public int getLenght(){
        int lenght = raceAthletes.size();
        return lenght;
    }
}
