package com.hang.Homework.Chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class Homework417 {
    public static HashMap<String, Integer> monthMap = new HashMap<>();

    static {
        monthMap.put("Jan", 31);
        monthMap.put("Feb", 28);
        monthMap.put("Mar", 31);
        monthMap.put("Apr", 30);
        monthMap.put("May", 31);
        monthMap.put("Jun", 30);
        monthMap.put("Jul", 31);
        monthMap.put("Aug", 31);
        monthMap.put("Sep", 30);
        monthMap.put("Oct", 31);
        monthMap.put("Nov", 30);
        monthMap.put("Dec", 31);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        System.out.println("Enter a month");
        String month = scanner.next();
        scanner.close();

        if ("Feb".equals(month) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(month + " " + year + " has " + 29 + " days");
        } else if (monthMap.containsKey(month)) {
            System.out.println(month + " " + year + " has " + monthMap.get(month) + " days");
        } else {
            System.out.println(month + " is not a correct month name");
        }
    }
}
