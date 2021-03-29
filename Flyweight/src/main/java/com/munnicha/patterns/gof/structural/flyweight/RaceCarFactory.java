package com.munnicha.patterns.gof.structural.flyweight;

import com.munnicha.patterns.gof.structural.flyweight.model.FerrariCar;
import com.munnicha.patterns.gof.structural.flyweight.model.MercedesCar;
import com.munnicha.patterns.gof.structural.flyweight.model.RaceCar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author munnicha
 */
public class RaceCarFactory {
    
    private static Map<String, RaceCar> flyweightRaceCars = new HashMap<>();
    
    public static RaceCar getRaceCar(String carKey) {
        if(flyweightRaceCars.containsKey(carKey)){
            return flyweightRaceCars.get(carKey);
        }else{
            RaceCar car;
            if("FERRARI".equalsIgnoreCase(carKey)){
                car = new FerrariCar("F2021","red","goodyear","no-commercials","classic");
            }else if("MERCEDES".equalsIgnoreCase(carKey)){
                car = new MercedesCar("M2021","silver","pirelli","with-commercials","modern");
            }else{
                throw new IllegalArgumentException("Unsupported car type.");
            }
            flyweightRaceCars.put(carKey, car);
            return flyweightRaceCars.get(carKey);
        }
    }   
}
