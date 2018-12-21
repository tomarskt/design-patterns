package com.itextech.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);  // Sort cars
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("for:"+cars.get(i));
        }
        for (String i : cars) {
            System.out.println("foreach:"+i);
        }
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(55);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);
        Collections.sort(myNumbers);  // Sort cars
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
