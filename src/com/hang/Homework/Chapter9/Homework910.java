package com.hang.Homework.Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework910 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        List<Double> roots = quadraticEquation.getRoots();
        System.out.println(roots);
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private double getRoot1() {
        return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    private double getRoot2() {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    public List<Double> getRoots() {
        ArrayList<Double> list = new ArrayList<>();
        if (this.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (this.getDiscriminant() > 0) {
            list.add(this.getRoot1());
            list.add(this.getRoot2());
        } else {
            list.add(getRoot1());
        }
        return list;
    }
}