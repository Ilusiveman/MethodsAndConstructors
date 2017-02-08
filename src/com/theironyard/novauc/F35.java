package com.theironyard.novauc;
/****
 * Created by daveoffice on 2/7/17.
 */
public class F35 {
    String manufacturer;
    String type;
    int crew;
    char desingation;
    boolean isairplane;

    public F35(String manufacturer, String type, int crew, char desingation, boolean isairplane) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.crew = crew;
        this.desingation = desingation;
        this.isairplane = isairplane;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public char getDesingation() {
        return desingation;
    }

    public void setDesingation(char desingation) {
        this.desingation = desingation;
    }

    public boolean isIsairplane() {
        return isairplane;
    }

    public void setIsairplane(boolean isairplane) {
        this.isairplane = isairplane;
    }

    public static void F35(String[] args) {
        int x = 20;
        int y = 20;

        if(x==y){
            System.out.println("X equals Y");
        }
    }
}

