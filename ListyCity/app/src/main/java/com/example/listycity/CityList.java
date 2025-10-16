package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This is a class that deletes a city from the list if the list contains that city
     * @param city
     * This is a candidate city to remove
     */
    public void delete(City city){
        if (!(cities.contains(city))) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This class returns the amount of cities that are in the list
     * @return
     * Return the list length
     */
    public int countCities() {
        List<City> list = cities;
        return list.size();
    }

    /**
     * This checks if a city is already in the list
     * @param city
     * This is a candidate city to check
     * @return
     * Return a boolean value
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }


}
