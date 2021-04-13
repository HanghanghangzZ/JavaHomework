package com.hang.Homework.Chapter4;

import java.util.Scanner;

public class Homework49 {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner scanner = new Scanner(System.in);
        char ascii = scanner.nextLine().charAt(0);
        int code = ascii;
        System.out.println("The Unicode for the character " + ascii + " is " + code);
    }
}
