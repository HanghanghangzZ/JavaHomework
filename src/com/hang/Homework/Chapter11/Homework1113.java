package com.hang.Homework.Chapter11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Homework1113 {
    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        System.out.println("The distinct integers are");
        System.out.println(list);
    }
}
