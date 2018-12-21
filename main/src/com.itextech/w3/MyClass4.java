package com.itextech.w3;

public class MyClass4 {
    final int x = 10;

    public static void main(String[] args) {
        MyClass4 myObj = new MyClass4();
//        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
