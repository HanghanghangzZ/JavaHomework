package com.hang.Homework.Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input two num");
        int num1, num2;
        try {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } catch (InputMismatchException inputMismatchException) {
            while ("/n".equals(scanner.next()));
            System.out.println("please input again");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } finally {
            scanner.close();
        }
    }
}
