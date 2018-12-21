package com.kforce.w3;

public class Person {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Person myObj1 = new Person();
        System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
        System.out.println("Age: " + myObj1.age);
        Person myObj = new Person();
        myObj.age=50;
        myObj.fname="Sudhir";
        myObj.lname="Tomar";
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
