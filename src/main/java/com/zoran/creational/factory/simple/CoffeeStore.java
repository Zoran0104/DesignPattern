package com.zoran.creational.factory.simple;

import com.zoran.creational.factory.entity.Coffee;

public class CoffeeStore {
    public void sellCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.getCoffee(type);
        coffee.getName();
    }
}
