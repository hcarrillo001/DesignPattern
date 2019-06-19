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
public abstract class Vehicle {
    private String color;
    private int numOfPassengers;
    private double fuelCapacity;
    
    public abstract void move();

    public Vehicle() {
        this.color = new String("Gray");
        this.numOfPassengers = 1;
        this.fuelCapacity = 0.0;
    }
    

    public Vehicle(String color, int numOfPassengers, double fuelCapacity) {
        this.color = color;
        this.numOfPassengers = numOfPassengers;
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
