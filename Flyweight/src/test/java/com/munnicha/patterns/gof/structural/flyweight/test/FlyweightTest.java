package com.munnicha.patterns.gof.structural.flyweight.test;

import com.munnicha.patterns.gof.structural.flyweight.RaceCarFactory;
import com.munnicha.patterns.gof.structural.flyweight.model.RaceCarPilot;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class FlyweightTest {
    
    @Test
    public void testFlyweight(){
        RaceCarPilot pilot1 = new RaceCarPilot("Leclerc", "Ferrari");
        RaceCarPilot pilot2 = new RaceCarPilot("Hamilton", "Mercedes");

        List<RaceCarPilot> ferrariPilots = new ArrayList<>();
        ferrariPilots.add(pilot1);
        List<RaceCarPilot> mercedesPilots = new ArrayList<>();
        mercedesPilots.add(pilot2);
        List<String> cars=new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Mercedes");
        int pilot=-1;
        int cartype=-1;
        for(int i=0;i<5;i++){
            pilot=i;
            cartype=0;
            ferrariPilots.add(new RaceCarPilot("P"+pilot, cars.get(cartype)));
        }
        for(int i=0;i<5;i++){
            pilot=i+5;
            cartype=1;
            mercedesPilots.add(new RaceCarPilot("P"+pilot, cars.get(cartype)));
        }
        
        //assert
        ferrariPilots.forEach(p -> {
            assertEquals(p.getCar(),RaceCarFactory.getRaceCar("Ferrari"));
        });
        
        mercedesPilots.forEach(p -> {
            assertEquals(p.getCar(),RaceCarFactory.getRaceCar("Mercedes"));
        });
        
    }
    
}
