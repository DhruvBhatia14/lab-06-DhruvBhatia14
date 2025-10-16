package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of City objects.
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist.
     * @param city
     * This is a candidate city to add.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities.
     * @return list
     * Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a boolean depending on whether city is in the list.
     * @param city
     * City whose belonging needs to be checked.
     * @return boolean
     * Return the boolean.
     */
    public boolean hasCity(City city) {
        for (City city_in_list : cities) {
            if (city_in_list.equals(city)) {
                return true;
            };
        }
        return false;
    }

    /**
     * This deletes given city from the list or returns an exception.
     * @param city
     * City which needs to be deleted.
     */
    public void delete(City city) {
        if(!this.hasCity(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This counts the number of cities existing in the list.
     * @return size of the cities list
     * Returns the count of the cities.
     */
    public int countCities() {
        return cities.size();
    }
}
