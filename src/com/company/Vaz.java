package com.company;

public class Vaz extends Car {

    public Vaz(String color, int price) {
        model = "VAZ";
        this.color = color;
        this.price = price;
    }

    @Override
    public double getEngineCapacity() {
        return 0.5;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
