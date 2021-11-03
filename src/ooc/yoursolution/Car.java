/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

/**
 *
 * @author Leisly Pino
 */
public final class Car {
    
    public final String make;
    public final int rate;
    public final int availability;

    public Car (String make, int rate, int availability){
        this.make = make;
        this.rate = rate;
        this.availability = availability;
        
    }
    public String getMake() {
        return make;
    }

    public int getRate() {
        return rate;
    }

    public int getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Make " + make + ", € " +rate+ " per day, there are " + availability + " of them."; 
    }
    
    
}
