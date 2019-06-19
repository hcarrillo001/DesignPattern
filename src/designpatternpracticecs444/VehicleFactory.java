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
public class VehicleFactory {
    
    private static final VehicleFactory instance = new VehicleFactory();            //final lock in the instance singleton design pattern. Can only be created within the class
    
    private VehicleFactory(){
        
    }
    
    public static VehicleFactory getInstance(){
        return instance;
    }
    
    public static Vehicle getVehicle(String type){              //static to this class. we dont need an object for it. 
        
        if(type.equals("car")){
            return new Automobile();
        }
        else if(type.equals("boat")){
            return new Boat();
        }
        else if(type.equals("airplane")){
            return new Airplane(); 
        }
        
        return null;
    }
    
    
}
