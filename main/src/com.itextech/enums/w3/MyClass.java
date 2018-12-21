package com.itextech.enums.w3;

public class MyClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
        System.out.println(Level.HIGH);
        System.out.println(Level.LOW);
        for (Level myVal : Level.values()) {
            System.out.println(myVal);
        }
    }
}
