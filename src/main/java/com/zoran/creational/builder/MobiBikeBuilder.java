package com.zoran.creational.builder;

public class MobiBikeBuilder extends BikeBuilder{
    @Override
    public void buildFrame() {
        bike.setFrame("mobi");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("mobi");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
