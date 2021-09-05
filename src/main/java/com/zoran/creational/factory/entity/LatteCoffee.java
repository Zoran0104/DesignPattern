package com.zoran.creational.factory.entity;

public class LatteCoffee extends Coffee{
    @Override
    public void getName() {
        this.addSugar();
        this.addMilk();
        System.out.println("latte");
    }
}
