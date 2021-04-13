package com.hang.Homework.Chapter4;

import java.util.Scanner;

public class Homework48 {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        scanner.close();
        char ascii = (char) code;
        System.out.println("The character for ASCII code " + code + " is " + ascii);
    }
}
