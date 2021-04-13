package com.hang.Homework.Chapter2;

import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        double celsius = 0, fahrenheit = 0;

        System.out.println("Enter a degree in Celsius");
        Scanner scanner = new Scanner(System.in);

        celsius = scanner.nextDouble();
        scanner.close();

        fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
