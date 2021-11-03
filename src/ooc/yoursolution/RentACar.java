package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;
/**
 *
 * @author Leisly Pino 2020303
 */
public class RentACar implements RentACarInterface {
    
    List<CarInterface> Cars;
    String name;
    int numCars;
    
    public RentACar(List<CarInterface> cars, String name, int numCars){
        this.Cars = cars;
        this.name = name;
        this.numCars = numCars;
    }

    @Override
    public List<CarInterface> getCars() {
        return Cars;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.Cars = cars;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        boolean check = false;
        for(CarInterface availability : Cars){
            if(availability.getMake() == make){
                for (int i=0; i < lengthOfRent; i++){
                    if (availability.getAvailability().get(month)[day+1-1]){
                        check = false;
                        break;
                    } else
                        check = true;
                }
            }
        }
        return check;
    }
    

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public int getNumberOfCars() {
        return numCars;
    }
}
