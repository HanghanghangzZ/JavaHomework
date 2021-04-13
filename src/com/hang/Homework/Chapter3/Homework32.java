package com.hang.Homework.Chapter3;

import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {
        int a = (int) System.currentTimeMillis() % 10;
        int b = (int) System.currentTimeMillis() / 10 % 10;
        int c = (int) System.currentTimeMillis() / 100 % 10;

        int answer = a + b + c;

        System.out.println("What is " + a + " + " + b + " + " + c);

        Scanner scanner = new Scanner(System.in);
        int inputAnswer = scanner.nextInt();
        scanner.close();

        System.out.println(a + " + " + b + " + " + c + " answer is " + inputAnswer + " " + (inputAnswer == answer));
    }
}
