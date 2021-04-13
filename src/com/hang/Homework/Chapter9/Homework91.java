package com.hang.Homework.Chapter9;

public class Homework91 {

    static class Rectangle {
        private double width = 1;
        private double height = 1;

        public Rectangle() {
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.height + this.width) * 2;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle1 = new Rectangle(3.5, 35.9);

        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}

