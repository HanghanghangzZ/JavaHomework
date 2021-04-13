package com.hang.Homework.Chapter6;

import java.util.Scanner;

public class Homework618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scanner.next();
        scanner.close();
        isValidPassword(password);
    }

    public static boolean isValidPassword(String password) {
        boolean flag = false;
        int numCount = 0, wordCount = 0;

        for (char ch : password.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                numCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                wordCount++;
            }
        }

        if (password.length() >= 8 && numCount >= 2 && (numCount + wordCount == password.length()) && numCount != password.length()) {
            flag = true;
        }

        if (!flag) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Valid password");
        }
        return flag;
    }
}
