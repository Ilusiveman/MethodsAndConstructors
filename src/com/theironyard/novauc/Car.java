package com.theironyard.novauc;

/**
 * Created by daveoffice on 2/7/17.
 */
public class Car {
    String make;
    String model;
    String color;
    int year;
    int type;



    public void setMake(String make) {
        make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMake() {

        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getType() {
        return type;
    }

    public Car(String make, String model, String color, int year, int type) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;


    }
    public static void Car(String [] args) {
        int x = 10;
        int y = 100;

        if(x < y){
            System.out.println("X is less than Y");
        }
    }





}
