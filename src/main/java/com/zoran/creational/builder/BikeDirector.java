package com.zoran.creational.builder;

public class BikeDirector {
    private BikeBuilder builder;

    public BikeDirector(BikeBuilder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
