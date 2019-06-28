package com.company;

public class BMW extends Car {

    public BMW(String color, int price) {
       model = "BMW";
       this.color = color;
       this.price = price;
    }

    @Override
    public double getEngineCapacity() {
        return 1.2;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}
