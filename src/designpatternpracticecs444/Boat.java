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
public class Boat extends Vehicle{

    public Boat(String color, int numOfPassengers, double fuelCapacity) {
        super(color, numOfPassengers, fuelCapacity);
    }
    
    public Boat(){
        super("White", 4, 20.0);
    }
    
  
    public void move(){
        System.out.println("Boat is sailing");
    }
}
