package com.hang.experiment.ex1;

import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println("The discriminant is " + (Math.pow(b, 2) - 4 * a * c));
    }
}
