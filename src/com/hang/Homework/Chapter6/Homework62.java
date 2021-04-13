package com.hang.Homework.Chapter6;

import java.util.Scanner;

public class Homework62 {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits (long n) {
        long num = n;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
