package com.hang.Homework.Chapter2;

import java.util.Scanner;

public class Homework219 {
    public static void main(String[] args) {
        double x1 = 0, x2 = 0, x3 = 0;
        double y1 = 0, y2 = 0, y3 = 0;

        System.out.println("Enter the coordinates of three points separated by spaces");

        Scanner scanner = new Scanner(System.in);
        System.out.println("The x1 y1 x2 y2 x3 y3:");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        scanner.close();

        double edge1 = 0, edge2 = 0, edge3 = 0, s = 0, area = 0;
        edge1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        edge2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        edge3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        s = (edge1 + edge2 + edge3) / 2;
        area = Math.sqrt(s * (s - edge1) * (s - edge2) * (s - edge3));

        System.out.println("The area of the triangle is " + area);
    }
}
