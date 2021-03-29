package com.munnicha.patterns.gof.structural.flyweight.model;

import com.munnicha.patterns.gof.structural.flyweight.RaceCarFactory;

/**
 *
 * @author munnicha
 */
public class RaceCarPilot {
    
    private RaceCar car;
    private String pilotName;
    private int distance=0;
    
    public RaceCarPilot(String pilotName, String carType){
        this.pilotName=pilotName;
        this.car = RaceCarFactory.getRaceCar(carType);
    }
    
    public void moveCar(int distance){
        car.moveCar(distance);
    }

    public RaceCar getCar() {
        return car;
    }

    public String getPilotName() {
        return pilotName;
    }

    public int getDistance() {
        return distance;
    }
}
