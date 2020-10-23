package com.example.miniproject;

public class item8 implements Comparable<item8>{
    private int km;
    private String name;

    public item8(){

    }
    public item8(int km, String name) {
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
    public int compareTo(item8 item) {
        return this.km>item.km ? 1:(this.km<item.km ? -1 : 0);

    }

}

