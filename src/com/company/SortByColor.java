package com.company;

import java.util.Comparator;

public class SortByColor implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if("white".equals(o1.color) && "white".equals(o2.color)){
            return 0;
        }

        if ("white".equals(o1.color) && !"white".equals(o2.color)){
            return -1;
        }

        if (!"white".equals(o1.color) && "white".equals(o2.color)){
            return 1;
        }

        return 0;
    }
}
