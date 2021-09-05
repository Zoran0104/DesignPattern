package com.zoran.creational.singleton.boken;

import com.zoran.creational.singleton.DoubleCheckedLocking;

import java.io.*;

public class SerializableBroke {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleCheckedLocking doubleCheckedLocking = DoubleCheckedLocking.getInstance();
        writeObj(doubleCheckedLocking);
        Object o1 = readObj();
        Object o2 = readObj();
        System.out.println(o1 == o2);
        System.out.println(o1.getClass());
        System.out.println(o2.getClass());
    }

    private static void writeObj(Object object) throws IOException {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("obj.bin"))) {
            stream.writeObject(object);
        }
    }

    private static Object readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("obj.bin"));
        return stream.readObject();
    }
}
