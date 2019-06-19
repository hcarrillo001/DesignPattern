/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpracticecs444;

/**
 *
 * @author carri
 */
public class CreationDesignPatternPracticeCS444 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Singleton
        VehicleFactory factory = VehicleFactory.getInstance();              //return static variable so your method should be static 
        
        
        //Abstract Factory
        Vehicle v = VehicleFactory.getVehicle("car");
        v.move();
        v = VehicleFactory.getVehicle("boat");                      //using a factory design patten for all three vehicles
        v.move();
        v = VehicleFactory.getVehicle("airplane");
        v.move();
        
        
    }
    
    
}
