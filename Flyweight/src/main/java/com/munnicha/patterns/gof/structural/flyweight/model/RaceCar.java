package com.munnicha.patterns.gof.structural.flyweight.model;

/**
 *
 * @author munnicha
 */
public abstract class RaceCar {
    
    String name;
    String color;
    String tyre;
    String vinyl;
    String logo;

    public RaceCar(String name, String color, String tyre, String vinyl, String logo) {
        this.name = name;
        this.color = color;
        this.tyre = tyre;
        this.vinyl = vinyl;
        this.logo = logo;
    }

    abstract void moveCar(int distance);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTyre() {
        return tyre;
    }

    public String getVinyl() {
        return vinyl;
    }

    public String getLogo() {
        return logo;
    }
}
