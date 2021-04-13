package com.hang.Homework.Chapter9;

public class Homework99 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(regularPolygon1.getArea() + " " + regularPolygon1.getPerimeter());
        System.out.println(regularPolygon2.getArea() + " " + regularPolygon2.getPerimeter());
        System.out.println(regularPolygon3.getArea() + " " + regularPolygon3.getPerimeter());
    }

}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (n * Math.pow(this.side, 2)) / 4 * Math.tan(Math.PI / this.n);
    }
}