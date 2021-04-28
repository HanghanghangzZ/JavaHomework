package com.hang.experiment.ex3;

public class EXP3_9 {
    public static void main(String args[]) {
        Circle c = new Circle(10);
        System.out.println("\n" + c.toString());
    }
}

class Circle {
    private int radius;

    Circle(int r) {
        setRadius(r);
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public String toString() {
        return "圆半径：" + getRadius() + " 圆面积：" + getArea();
    }
}