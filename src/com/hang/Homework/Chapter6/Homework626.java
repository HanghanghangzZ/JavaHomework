package com.hang.Homework.Chapter6;

public class Homework626 {
    public static void main(String[] args) {
        printPalindromicPrime();
    }

    public static boolean isPalindromicNum(int num) {
        String s = Integer.toString(num);
        int pre = 0, next = s.length() - 1;

        while (pre < next) {
            if (s.charAt(pre) != s.charAt(next)) {
                return false;
            }
            pre++;
            next--;
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPalindromicPrime() {
        int count = 0;
        int[] palindromicPrime = new int[100];
        for (int i = 2; count < 100; i++) {
            if (isPalindromicNum(i) && isPrime(i)) {
                palindromicPrime[count] = i;
                count++;
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print(palindromicPrime[i - 1] + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
