package com.zoran.Singleton;

@SuppressWarnings("all")
public class DoubleCheckedLocking {
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
}
