/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;



/**
 *
 * @author Genti
 */
public class Airline {
    private String name;
    public Flight [] flights ;
    private int flightId;
    private int index = 0;
    
    public Airline(String name , int nrFlights ,int flightId ){
        this.name = name;
        flights= new Flight[nrFlights];
        this.flightId = flightId;
        
    }

    public String getName() {
        return name;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlightId(int flightId) {
       if(this.flightId == f.getFlightId){
           System.out.println("ERROR: This id is already used");
       }
        this.flightId = flightId;
    }
    
    
    
    
    
    public boolean exists (Flight f){
        for(int i = 0 ; i <index ; i++){
            if(flights[i]==f)
                return true;
        }
        return false;
    }
    
    
    
    public void addFlight(Flight f){
        if(f==null){
            System.out.println("The flight does not exist");
        }
        if(exists(f)) {
            System.out.println("The flight already exists");
        }
        if(!exists(f)){
            System.out.println("The flight does not exist");
            flights[index]=f;
            index++;
        }
    }
    
    
    
}


