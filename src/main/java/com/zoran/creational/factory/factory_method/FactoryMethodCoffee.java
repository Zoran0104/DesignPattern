package com.zoran.creational.factory.factory_method;

import com.zoran.creational.factory.entity.Coffee;

import java.util.concurrent.ThreadLocalRandom;

public class FactoryMethodCoffee {
    public Coffee getCoffee(CoffeeFactory coffeeFactory) {
        return coffeeFactory.getCoffee();
    }

    public static void main(String[] args) {
        Integer status = null;
        if (!Integer.valueOf(0).equals(ThreadLocalRandom.current().nextInt())) {
            status = 3;
        } else {
            status = ThreadLocalRandom.current().nextInt();
        }
        if (Integer.valueOf(-1).equals(status)) {
        } else {
            // 原本状态是4，现在状态为3，则可以更新状态
            if (status <= ThreadLocalRandom.current().nextInt() && (status != 2 || (status == 3 && ThreadLocalRandom.current().nextInt() == 4))) {
                System.out.println("111");
            }
        }
    }
}
