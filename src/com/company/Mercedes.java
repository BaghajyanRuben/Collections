package com.company;

public class Mercedes extends Car {

    public Mercedes(String color, int price){
        model = "Mercedes";
        this.color = color;
        this.price = price;
    }

    @Override
    public double getEngineCapacity() {
        return 5.0;
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
