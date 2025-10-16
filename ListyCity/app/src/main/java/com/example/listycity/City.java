package com.example.listycity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;
    /**
     * This creates a city object with the given city name and province
     * @param city
     * This is the name of the new city object
     * @param province
     * This is the province of the new city object
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This gives the name of the city object
     * @return
     * Return the city object's name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This gives the province of the city object
     * @return
     * Return the city object's province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This gives the name of the city object
     * @param o
     * This is the city which the city list object will be compared to
     * @return
     * Return int
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

}

