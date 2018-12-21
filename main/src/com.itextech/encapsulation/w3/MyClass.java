package com.kforce.encapsulation.w3;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John");  // error
        System.out.println(myObj.getName()); // error
        Scanner myObjScanner = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObjScanner.nextLine();
        System.out.println("Username is: " + userName);
    }
}
