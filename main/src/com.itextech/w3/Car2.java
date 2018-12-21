package com.itextech.w3;

public class Car2 {
    int modelYear;
    String modelName;

    public Car2(int year, String name) {
        this.modelYear = year;
        this.modelName = name;
    }

    public static void main(String[] args) {
        Car2 myCar = new Car2(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

