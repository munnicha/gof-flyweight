package com.munnicha.patterns.gof.structural.flyweight.model;

/**
 *
 * @author munnicha
 */
public class MercedesCar extends RaceCar{

    public MercedesCar(String name, String color, String tyre, String vinyl, String logo) {
        super(name, color, tyre, vinyl, logo);
        System.out.println("Mercedes car was initiated.");
    }

    @Override
    void moveCar(int distance) {
        String path="";
        for(int i=0;i<distance;i++){
            path+="_";
        }
        path+="o^=M=o>";
        System.out.print(path);
    }
    
}
