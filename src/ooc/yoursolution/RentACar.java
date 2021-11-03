package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;
/**
 *
 * @author Leisly Pino 2020303
 */
public class RentACar implements RentACarInterface {
    
    List<CarInterface> Cars;

    @Override
    public List<CarInterface> getCars() {
        
        return Cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.Cars.add((CarInterface) cars);
    }

    @Override
    public String getName() {
        return Cars.
    }

    @Override
    public void setName(String name) {
        boolean contentEquals = this.Cars.toString().contentEquals(name);
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        for(CarInterface availability : Cars){
            if(availability.isAvailable(month, day)){
                return availability.setAvailability(availability);
            }
       
        }
        return null;
    }
    

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public int getNumberOfCars() {
        
    }
}
