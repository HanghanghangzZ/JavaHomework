package com.hang.Homework.Chapter4;

import java.util.Scanner;

public class Homework41 {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center to a vertex:");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        scanner.close();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f", area);
    }
}
