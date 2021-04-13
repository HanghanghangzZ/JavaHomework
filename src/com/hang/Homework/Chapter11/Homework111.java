package com.hang.Homework.Chapter11;

import java.util.Date;
import java.util.Scanner;

public class Homework111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input side1, side2, side3");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println("please input color and filled");
        String color = scanner.next();
        boolean filled = scanner.nextBoolean();

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString() + "\n"
                + triangle.getArea() + "\n"
                + triangle.getPerimeter() + "\n"
                + triangle.getColor() + "\n"
                + triangle.isFilled());
    }
}

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "side1 = " + side1 +
                " side2 = " + side2 +
                " side3 = " + side3;
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + "\n" +
                "color: " + color + " and filled:" + this.filled;
    }
}
