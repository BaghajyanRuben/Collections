package com.company;

public abstract class Car implements Comparable<Car>{
    protected String color;
    protected int price;
    protected String model;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive(){
        speed++;
    }

    public abstract double getEngineCapacity();

    public abstract int getHorsePower();

    @Override
    public String toString() {
        return "{ " + model + " | " + " color = " + color + " price = " + price;
    }
}
