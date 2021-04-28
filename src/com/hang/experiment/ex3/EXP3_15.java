package com.hang.experiment.ex3;

public class EXP3_15 {
    // Main method
    public static void main(String[] args) {
        // Create two comparable circles
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(4);

        // Display the max circle
        Circle1 circle = (Circle1) GeometricObject1.max(circle1, circle2);
        System.out.println("The max circle's radius is " + circle.getRadius());
        System.out.println(circle);

        System.out.println("--------------------------------------------------------------");

        // Create two comparable rectangles
        Rectangles rectangles1 = new Rectangles(4, 4);
        Rectangles rectangles2 = new Rectangles(5, 5);

        // Display the max rectangles
        Rectangles rectangles = (Rectangles) GeometricObject1.max(rectangles1, rectangles2);
        System.out.println("The max rectangles's length is" + rectangles.getLength()
                            + ", width is " + rectangles.getWidth());
        System.out.println(rectangles);

        System.out.println("--------------------------------------------------------------");

        // Display the max graph
        GeometricObject1 graph = GeometricObject1.max(circle, rectangles);
        System.out.println(graph);
    }
}

abstract class GeometricObject1 implements Comparable {
    abstract double getArea();

    static GeometricObject1 max(GeometricObject1 object1, GeometricObject1 object2) {
        return object1.getArea() > object2.getArea() ? object1 : object2;
    }
}

// Circle.java: The circle class that extends GeometricObject
class Circle1 extends GeometricObject1 {
    private int radius;

    Circle1(int r) {
        this.radius = r;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    public String toString() {
        return "圆半径：" + getRadius() + " 圆面积：" + getArea();
    }

    @Override
    public int compareTo(Object o) {
        GeometricObject1 g = (GeometricObject1) o;

        if (this.getArea() == g.getArea()) {
            return 0;
        } else if (this.getArea() > g.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Rectangles extends GeometricObject1 {
    private int width;
    private int length;

    public Rectangles(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangles{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        GeometricObject1 g = (GeometricObject1) o;

        if (this.getArea() == g.getArea()) {
            return 0;
        } else if (this.getArea() > g.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
