/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
/**
 *
 * @author Leisly Pino
 */
public class BookingSystem implements BookingSystemInterface{

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
       RentACarInterface rent = null;
       List<CarInterface> cars = new ArrayList<>();
       String name;
       int id = 0;
       
       try(BufferedReader rd = in){
           String line;
           name = rd.readLine();
           
           while ((line = rd.readLine()) != null){
               String [] ln = line.split(":");
               Make make = Make.valueOf(ln[0]);
               double rate = Double.parseDouble(ln[1]);
               int available = Integer.parseInt(ln[2]);
               
               for (int i=0; i<available; i++){
                   Car car = new Car(make, rate, id);
                   cars.add(car);
                   id++;
               }
           }
           rent = new RentACar(cars, name, id);
       } catch (IOException e){
           e.printStackTrace();
       }
        return rent;
       
    }

  

    
}
