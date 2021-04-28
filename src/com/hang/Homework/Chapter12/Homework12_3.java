package com.hang.Homework.Chapter12;

import java.util.Scanner;

public class Homework12_3 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println("please input the index of arrays");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.close();

        try {
            System.out.println(nums[index]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Out of Bounds");
        }
    }
}
