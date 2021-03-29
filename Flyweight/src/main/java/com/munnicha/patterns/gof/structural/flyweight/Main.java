package com.munnicha.patterns.gof.structural.flyweight;

import com.munnicha.patterns.gof.structural.flyweight.model.RaceCarPilot;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaceCarPilot pilot1 = new RaceCarPilot("Leclerc", "Ferrari");
        RaceCarPilot pilot2 = new RaceCarPilot("Hamilton", "Mercedes");
        //random pilots
        List<RaceCarPilot> pilots = new ArrayList<>();
        pilots.add(pilot1);
        pilots.add(pilot2);
        Random rand=new Random();
        List<String> cars=new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Mercedes");
        int pilot=-1;
        int cartype=-1;
        for(int i=0;i<10;i++){
            pilot=rand.nextInt(99);
            cartype=rand.nextInt(1);
            pilots.add(new RaceCarPilot("P"+pilot, cars.get(cartype)));
        }
        //lets race
        int distance=0;
        for(int i=0;i<pilots.size();i++){
            distance=rand.nextInt(100);
            pilots.get(i).moveCar(distance);
            System.out.println(" "+pilots.get(i).getPilotName()+"("+distance+")");
        }
    }
    
}
