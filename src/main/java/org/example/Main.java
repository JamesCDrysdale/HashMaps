package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Country> countryMap = new HashMap<>();

        // Create Individual Countries
        Country uk = new Country("UK", 64100000, "Europe", "London");
        Country germany = new Country("Germany", 80620000, "Europe", "Berlin");
        Country france = new Country("France", 66030000, "Europe", "Paris");
        Country japan = new Country("Japan", 127300000, "Asia", "Tokyo");

        // Add each country to the HashMap countryMap
        countryMap.put("UK", uk);
        countryMap.put("Germany", germany);
        countryMap.put("France", france);
        countryMap.put("Japan", japan);

        // Output some values from the HashMap
        System.out.println("Country Name: " + countryMap.get("Japan").getName());
        System.out.println("France Population: " + countryMap.get("France").getPopulation());
        System.out.println("Germany Capital: " + countryMap.get("Germany").getCapital());
        System.out.println("UK Continent: " + countryMap.get("UK").getContinent());

        // Investigate the use of the .values() and .keySet() methods
        System.out.println(countryMap.values()); // Produces a collection of Country object's Hash Codes
        System.out.println(countryMap.keySet());

        // Make a function that outputs: In + country + there are + population + people.
        // The capital of + country + is + capital + and it is in + continent +.
        for(Country country : countryMap.values()){
            System.out.println("In " + country.getName() + " there are " + country.getPopulation() + " people.");
            System.out.println("The capital of " + country.getName() + " is " + country.getCapital() + " and it is in " + country.getContinent() + ".");
        }





    }
}