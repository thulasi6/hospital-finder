package com.example.miniproject;

public class item2 implements Comparable<item2>{
    private int km;
    private String name;

    public item2(){

    }
    public item2(int km, String name) {
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
    public int compareTo(item2 item) {
        return this.km>item.km ? 1:(this.km<item.km ? -1 : 0);

    }

}

