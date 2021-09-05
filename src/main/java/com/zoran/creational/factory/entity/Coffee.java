package com.zoran.creational.factory.entity;

public abstract class Coffee {
    public abstract void getName();

    protected void addSugar() {
        System.out.println("add sugar");
    }

    protected void addMilk() {
        System.out.println("add milk");
    }


}
