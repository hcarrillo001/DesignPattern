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
public class Airplane extends Vehicle{

    public Airplane(String color, int numOfPassengers, double fuelCapacity) {
        super(color, numOfPassengers, fuelCapacity);
    }
    
    public Airplane(){
        super("White", 6, 45.0);
    }
    
    public void move(){
        System.out.println("Airplne is flying");
    }
    
    
}
