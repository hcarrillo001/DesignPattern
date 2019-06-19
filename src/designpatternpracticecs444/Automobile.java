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
public class Automobile extends Vehicle{

    public Automobile(String color, int numOfPassengers, double fuelCapacity) {
        super(color, numOfPassengers, fuelCapacity);
    }
    
    public Automobile(){
        super("Gray", 2, 12.0);
    }
    
    public void move(){
        System.out.println("Automobile is driving");
    }
    
    
    
    
    
    
    
  
    
}
