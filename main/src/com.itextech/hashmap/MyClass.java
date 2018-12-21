package com.kforce.hashmap;

// Import the HashMap class
import java.util.*;

public class MyClass {
    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
//        Collections.sort(capitalCities.keySet());
        System.out.println(capitalCities);
        for (String i : capitalCities.keySet()) {
            System.out.println("key:"+i);
            System.out.println("value:"+capitalCities.get(i));

        }
        for (String i : capitalCities.values()) {
            System.out.println("values:"+i);
//            System.out.println("values:"+capitalCities.);
//            System.out.println("values:"+capitalCities.);
        }

        for (Map.Entry<String, String> i : capitalCities.entrySet()) {
            System.out.println("key:"+i.getKey()+":value:"+i.getValue());
//            System.out.println("values:"+capitalCities.);
//            System.out.println("values:"+capitalCities.);
        }

        List keys = new ArrayList(capitalCities.keySet());
        System.out.println(keys);
        Collections.sort(keys);
        System.out.println(keys);

        List values = new ArrayList(capitalCities.values());
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);

        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}
