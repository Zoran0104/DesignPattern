package com.zoran.creational.factory.entity;

public class AmericanCoffee extends Coffee{
    @Override
    public void getName() {
        this.addSugar();
        System.out.println("american");
    }
}
