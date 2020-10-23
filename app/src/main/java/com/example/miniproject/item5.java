package com.example.miniproject;

public class item5 implements Comparable<item5>{
    private int km;
    private String name;

    public item5(){

    }
    public item5(int km, String name) {
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
    public int compareTo(item5 item) {
        return this.km>item.km ? 1:(this.km<item.km ? -1 : 0);

    }

}

