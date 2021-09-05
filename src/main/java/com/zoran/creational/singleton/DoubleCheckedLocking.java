package com.zoran.creational.singleton;

import java.io.Serializable;

@SuppressWarnings("all")
public class DoubleCheckedLocking implements Serializable {
    private DoubleCheckedLocking() {
    }

    private static volatile DoubleCheckedLocking INSTANCE;

    public static DoubleCheckedLocking getInstance() {
        if (null == INSTANCE) {
            synchronized (DoubleCheckedLocking.class) {
                if (null == INSTANCE) {
                    INSTANCE = new DoubleCheckedLocking();
                }
            }
        }
            return INSTANCE;
    }
    // 当进行反序列化时，会自动调用该方法，并将该方法的返回值直接返回
    public Object readResolve() {
        return INSTANCE;
    }

}
