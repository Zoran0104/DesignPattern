package com.zoran.creational.singleton.boken;

import com.zoran.creational.singleton.DoubleCheckedLocking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectBroke {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<DoubleCheckedLocking> doubleCheckedLockingClass = DoubleCheckedLocking.class;
        Constructor<DoubleCheckedLocking> constructor = doubleCheckedLockingClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        DoubleCheckedLocking o1 = constructor.newInstance();
        DoubleCheckedLocking o2 = constructor.newInstance();
        System.out.println(o1 == o2);
    }
}
