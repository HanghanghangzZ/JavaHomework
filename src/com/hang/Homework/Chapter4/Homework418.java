package com.hang.Homework.Chapter4;

import java.util.Scanner;

public class Homework418 {
    public static void main(String[] args) {
        String[] stu = {"freshman", "sophomore", "junior", "senior"};
        System.out.println("Enter two characters:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char c1 = s.charAt(0);
        char c2 = s.charAt(1);
        int index = c2 - '1';

        if ((c1 != 'M' && c1 != 'C' && c1 != 'I') ||
                (c2 != '1' && c2 != '2' && c2 != '3' && c2 != '4')) {
            System.out.println("Invalid input");
        } else {
            if (c1 == 'M') {
                System.out.println("Mathematics " + stu[index]);
            } else if (c1 == 'C') {
                System.out.println("Computer Science " + stu[index]);
            } else {
                System.out.println("Information Technology " + stu[index]);
            }

        }
    }
}
