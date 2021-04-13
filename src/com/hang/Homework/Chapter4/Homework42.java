package com.hang.Homework.Chapter4;

import java.util.Scanner;

public class Homework42 {
    public static void main(String[] args) {
        double x1 = 0, y1 = 0;
        double x2 = 0, y2 = 0;
        final double radius = 6371.01;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.close();

        double d = radius * Math.acos(
                Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))
        );
        System.out.println("The distance between the two points is " + d + " km");
    }
}
