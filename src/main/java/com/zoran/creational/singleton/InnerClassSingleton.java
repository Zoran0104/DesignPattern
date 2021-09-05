package com.zoran.creational.singleton;

public class InnerClassSingleton {
    private static class InnerClassSingletonProvider{
        private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonProvider.innerClassSingleton;
    }
}
