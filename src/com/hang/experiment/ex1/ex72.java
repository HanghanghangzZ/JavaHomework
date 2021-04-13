package com.hang.experiment.ex1;

import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter v1");
        double v1 = scanner.nextDouble();
        System.out.println("Enter v0");
        double v0 = scanner.nextDouble();
        System.out.println("Enter t");
        double t = scanner.nextDouble();
        scanner.close();

        System.out.println("average acceleration is " + ((v1 - v0) / t) + " m / (s ^ -2)");
    }
}
