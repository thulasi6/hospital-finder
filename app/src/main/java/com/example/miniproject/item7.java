package com.example.miniproject;

public class item7 implements Comparable<item7>{
    private int km;
    private String name;

    public item7(){

    }
    public item7(int km, String name) {
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
    public int compareTo(item7 item) {
        return this.km>item.km ? 1:(this.km<item.km ? -1 : 0);

    }

}
