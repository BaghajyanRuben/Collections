package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new BMW("black", 12000));
        cars.add(new BMW( "white", 15000));
        cars.add(new BMW( "green", 17000));
        cars.add(new BMW( "white", 15000));
        cars.add(new BMW( "black", 16000));
        cars.add(new BMW( "white", 15000));
        cars.add(new BMW( "black", 15000));
        cars.add(new BMW( "white", 15000));
        cars.add(new BMW( "black", 20000));
        cars.add(new BMW( "white", 10000));
        cars.add(new BMW( "black", 11000));
        cars.add(new BMW( "white", 13000));
        cars.add(new BMW( "black", 18000));

        print(cars);

        List<Car> newCars = new ArrayList<>(cars);
        Collections.copy(newCars, cars);
        Collections.sort(cars);


        Collections.sort(newCars, new SortByColor());

        print(cars);
        print(newCars);

        Collections.sort(cars, new SortByColor());
        print(cars);


//        ArrayList<String> list = new ArrayList<>();
//
//
//        for (int i = 0; i < 10; i++) {
//
//            list.add(String.valueOf(i));
//        }
//
//        list.add("5");
//        list.add("5");
//        list.add("5");
//        list.add("5");
//
////        Iterator<String> iterator = list.iterator();
//
////        while (iterator.hasNext()){
////            if ("5".equals(iterator.next())){
////                iterator.remove();
////            }
//
////        }
//
//
//
//
//
//        LinkedList<String>  linkedList = new LinkedList<>();
//
//        for (int i = 0; i < 10; i++) {
//            linkedList.add(String.valueOf(i));
//        }
//
//        print(linkedList);

    }

    private static void print(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println(" ");

    }
}
