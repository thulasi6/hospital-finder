package com.example.miniproject;

public class item6 implements Comparable<item6>{
    private int km;
    private String name;

    public item6(){

    }
    public item6(int km, String name) {
        this.km = km;
        this.name = name;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "*      km  :   " + km +
                "     " + name;
    }

    @Override
    public int compareTo(item6 item) {
        return this.km>item.km ? 1:(this.km<item.km ? -1 : 0);

    }

}

