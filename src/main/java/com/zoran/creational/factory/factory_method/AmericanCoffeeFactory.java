package com.zoran.creational.factory.factory_method;

import com.zoran.creational.factory.entity.AmericanCoffee;
import com.zoran.creational.factory.entity.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee getCoffee() {
        return new AmericanCoffee();
    }
}
