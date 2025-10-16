package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */

public class City implements Comparable<City> {
    /**
    * - String city - which stores the name of the city.
    */
    private String city;

    /**
     * - String province - which stores the name of the province the city is in.
     */
    private String province;

    /**
     * This constructor assigns a string value to the city and province variables.
     * @param city
     * The name of the city to be assigned to the city variable.
     * @param province
     * The name of the province to be assigned to the province variable.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the city.
     * @return city
     * Return the name variable.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the name of the province.
     * @return province
     * Return the province variable.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares the strings of two city names alphabetically.
     * @param data another city object to compare to
     * @return int type
     * Return return whether the strings are equal, less than or greater than.
     */
    @Override
    public int compareTo(City data) {
        return this.city.compareTo(data.getCityName()); // this.city refers to the city name
    }

    /**
     * This checks whether given object is equal to the one where method is called.
     * @param o another city object to compare to
     * @return boolean type
     * Return whether the strings are equal or not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) { return false; }

        City city = (City) o;
        if (this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName())) {
            return true;
        };
        return false;
    }
}
