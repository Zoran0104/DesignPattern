package com.zoran.creational.factory.simple;

import com.zoran.creational.factory.entity.AmericanCoffee;
import com.zoran.creational.factory.entity.Coffee;
import com.zoran.creational.factory.entity.LatteCoffee;

public class SimpleCoffeeFactory {
    public static Coffee getCoffee(String type) {
        if ("latte".equals(type)) {
            return new LatteCoffee();
        } else if ("american".equals(type)) {
            return new AmericanCoffee();
        } else {
            throw new RuntimeException();
        }
    }
}
