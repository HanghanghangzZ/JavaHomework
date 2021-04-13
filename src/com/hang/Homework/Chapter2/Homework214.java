package com.hang.Homework.Chapter2;

import java.util.Scanner;

public class Homework214 {
    public static void main(String[] args) {
        double weightInPounds = 0, heightInInches = 0, BMI = 0;

        System.out.println("Enter weight in pounds:");
        Scanner scanner = new Scanner(System.in);
        weightInPounds = scanner.nextDouble();
        System.out.println("Enter height in inches");
        heightInInches = scanner.nextDouble();
        scanner.close();

        double weightInKg = 0, heightInMeter = 0;
        final double CONVERSION_POUNDS_TO_KG = 0.45359237;
        final double CONVERSION_INCHES_TO_METER = 0.0254;
        weightInKg = weightInPounds * CONVERSION_POUNDS_TO_KG;
        heightInMeter = heightInInches * CONVERSION_INCHES_TO_METER;

        BMI = weightInKg / Math.pow(heightInMeter, 2);

        System.out.println("BMI is " + BMI);
    }
}
