package com.kforce.w3;


public class MyClass2 {
    public static class MyClassCar {
        int x = 5;
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }
    static int myMethod(int x) {
        return 5 + x;
    }
    static int myMethod(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
            throw new ArithmeticException("Underage User");

            // If age is greater than 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        myMethod("");
        System.out.println(myMethod(3));
        System.out.println(myMethod(15, 13));
        int z = myMethod(5, 3);
        System.out.println(z);
        checkAge(20);
        checkAge(40);
//        checkAge(10);
        MyClassCar myObj = new MyClassCar();
        System.out.println(myObj.x);
    }
}
