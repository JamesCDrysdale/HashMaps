package org.example;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

//        System.out.println(favouriteFruits.get("Alice"));

        HashMap<String, Integer> countryPopulations = new HashMap<String, Integer>();

        countryPopulations.put("UK", 60100000);
        countryPopulations.put("Germany", 80620000);
        countryPopulations.put("France", 66030000);
        countryPopulations.put("Japan", 127300000);

        System.out.println("UK: " + countryPopulations.get("UK"));
        System.out.println("Germany: " + countryPopulations.get("Germany"));
        System.out.println("France: " + countryPopulations.get("France"));
        System.out.println("Japan: " + countryPopulations.get("Japan"));
        System.out.println("The collection of values is: " + countryPopulations.values());
        System.out.println("The collection of values is: " + countryPopulations.keySet());
    }
}
