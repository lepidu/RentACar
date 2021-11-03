package ooc.yoursolution;

import ooc.enums.Make;

/**
 *
 * @author Leisly Pino 2020303
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

    Car(Make make, double rate, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
