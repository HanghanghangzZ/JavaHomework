package com.hang.Homework.Chapter3;

import java.util.Scanner;

public class Homework321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0, h = 0, q = 0, m = 0, j = 0, k = 0;

        System.out.println("Enter year: (e.g.,2012):");
        year = scanner.nextInt();
        System.out.println("Enter month: 1 ~ 12");
        m = scanner.nextInt();
        if (m == 1 || m == 2) {
            year--;
            m += 12;
        }
        System.out.println("Enter the day of the month: 1 ~ 31");
        q = scanner.nextInt();

        j = year / 100;
        k = year % 100;
        h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        String dayOfWeek = null;
        if (h == 0) {
            dayOfWeek = "Saturday";
        } else if (h == 1) {
            dayOfWeek = "Sunday";
        } else if (h == 2) {
            dayOfWeek = "Monday";
        } else if (h == 3) {
            dayOfWeek = "Tuesday";
        } else if (h == 4) {
            dayOfWeek = "Wednesday";
        } else if (h == 5) {
            dayOfWeek = "Thursday";
        } else if (h == 6) {
            dayOfWeek = "Friday";
        }
        System.out.println("Day of the week is " + dayOfWeek);
    }
}
