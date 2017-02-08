package com.theironyard.novauc;

/**
 * Created by daveoffice on 2/7/17.
 */
public class Redlight {
    String City;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean isAwesome() {
        return isAwesome;
    }

    public void setAwesome(boolean awesome) {
        isAwesome = awesome;
    }

    public Redlight(String city, String country, int population, String district, boolean isAwesome) {

        City = city;
        this.country = country;
        this.population = population;
        this.district = district;
        this.isAwesome = isAwesome;
    }

    String country;
    int population;
    String district;
    boolean isAwesome;

public static void Redlight(String[] args) {
    int x = 1000;
    int y = 1234;

    if(x < y){
        System.out.println("X is less than Y");
    }else if(x==y){
        System.out.println("X is equals Y");
    }



