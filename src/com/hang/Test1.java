package com.hang;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        Object circle1 = new Circle1();
        Object circle2 = new Circle1();
        System.out.println(circle1.equals(circle2));

        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        System.out.println(circle3.equals(circle4));

    }
}

class Circle {
    double radius;

    @Override
    public boolean equals(Object o) {
        return this.radius == ((Circle)o).radius;
    }
}

class Circle1 {
    double radius;

//    @Override
    public boolean equals(Circle1 o) {
        return this.radius == o.radius;
    }
}