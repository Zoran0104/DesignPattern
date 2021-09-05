package com.zoran.creational.builder;

public class OfoBikeBuilder extends BikeBuilder {

    @Override
    public void buildFrame() {
        bike.setFrame("ofo");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
