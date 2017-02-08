package com.theironyard.novauc;
/**
 * Created by daveoffice on 2/7/17.
 */
public class Gun {
    String maker;
    String cycleoffire;
    int magazinecapacity;
    int caiiber;
    boolean isPistol;

    public Gun(String maker, String cycleoffire, int magazinecapacity, int caiiber, boolean isPistol) {
        this.maker = maker;
        this.cycleoffire = cycleoffire;
        this.magazinecapacity = magazinecapacity;
        this.caiiber = caiiber;
        this.isPistol = isPistol;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getCycleoffire() {
        return cycleoffire;
    }

    public void setCycleoffire(String cycleoffire) {
        this.cycleoffire = cycleoffire;
    }

    public int getMagazinecapacity() {
        return magazinecapacity;
    }

    public void setMagazinecapacity(int magazinecapacity) {
        this.magazinecapacity = magazinecapacity;
    }

    public int getCaiiber() {
        return caiiber;
    }

    public void setCaiiber(int caiiber) {
        this.caiiber = caiiber;
    }

    public boolean isPistol() {
        return isPistol;
    }

    public void setPistol(boolean pistol) {
        isPistol = pistol;
    }

    public static void Gun(String[] args) {
        int x = 35;
        int y = 15;

        if(x > y){
            System.out.println("X is greater than Y");
        }

    }

}
