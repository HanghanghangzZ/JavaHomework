package com.hang.Homework.Chapter2;

import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args) {
        double meter = 0, feet = 0;
        final double CONVERSION = 0.305;

        System.out.println("Enter a value for feet");

        Scanner scanner = new Scanner(System.in);

        feet = scanner.nextDouble();
        scanner.close();

        meter = feet * CONVERSION;

        System.out.println(feet + " feet is " + meter + "meters");
    }
}
