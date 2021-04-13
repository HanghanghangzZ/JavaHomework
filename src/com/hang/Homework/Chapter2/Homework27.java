package com.hang.Homework.Chapter2;

import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
        double min = 0, years = 0, days = 0;

        System.out.println("Enter the number of minutes");

        Scanner scanner = new Scanner(System.in);

        min = scanner.nextDouble();
        scanner.close();

        years = min / (60 * 24 * 365);
        days = (min % (60 * 24 * 365)) / (60 * 24);

        System.out.println(min + " minutes is approximately " + years + " years" + days + " days");
    }
}
