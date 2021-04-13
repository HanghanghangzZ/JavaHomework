package com.hang.Homework.Chapter3;

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        System.out.println("Enter a, b, c");

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();

        double discriminant = 0;
        discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + discriminant) / (2 * a);
            double root2 = (-b - discriminant) / (2 * a);
            System.out.println("The equation has two root" + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = (-b + discriminant) / (2 * a);
            System.out.println("The equation has one root" + root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
