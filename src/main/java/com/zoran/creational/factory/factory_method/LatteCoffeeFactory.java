package com.zoran.creational.factory.factory_method;

import com.zoran.creational.factory.entity.Coffee;
import com.zoran.creational.factory.entity.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee getCoffee() {
        return new LatteCoffee();
    }
}
