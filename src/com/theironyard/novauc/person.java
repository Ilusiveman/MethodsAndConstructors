package com.theironyard.novauc;
/**
 * Created by daveoffice on 2/7/17.
 */
public class person {
    String name;
    String birthplace;
    int DOB;
    int age;
    boolean ishandsoe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIshandsoe() {
        return ishandsoe;
    }

    public void setIshandsoe(boolean ishandsoe) {
        this.ishandsoe = ishandsoe;
    }

    public person(String name, String birthplace, int DOB, int age, boolean ishandsoe) {

        this.name = name;
        this.birthplace = birthplace;
        this.DOB = DOB;
        this.age = age;
        this.ishandsoe = ishandsoe;
    }
    public static void person(String[]args) {
        int x = 69;
        int y = 1911;

        if(x < y){
            System.out.println("X is less than Y");
        }else if(x > y){
            System.out.println("X is greater than Y");
        }

    }
}
