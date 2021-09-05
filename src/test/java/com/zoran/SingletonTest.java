package com.zoran;

import com.zoran.creational.singleton.DoubleCheckedLocking;
import com.zoran.creational.singleton.EagerInitializedSingleton;
import com.zoran.creational.singleton.EnumSingleton;
import com.zoran.creational.singleton.InnerClassSingleton;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    /**
     * 用于测试EagerSingleton
     */
    @Test
    public void testEagerSingleton(){
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        System.out.println(instance2 == instance1);
    }

    /**
     * 用于测试DoubleCheckedSingleton
     */
    @Test
    public void testDoubleCheckedSingleton(){
        DoubleCheckedLocking instance1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking instance2 = DoubleCheckedLocking.getInstance();
        System.out.println(instance2 == instance1);
    }

    /**
     * 用于测试InnerSingleton
     */
    @Test
    public void testInnerSingleton(){
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        System.out.println(instance2 == instance1);
    }

    /**
     * 用于测试Enum
     */
    @Test
    public void testEnum(){
        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
    }
}
