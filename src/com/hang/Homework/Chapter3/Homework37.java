package com.hang.Homework.Chapter3;

import java.util.Scanner;

public class Homework37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an amount in double, for example 11.56:");
        double amount = scanner.nextDouble();
        scanner.close();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars > 0 && numberOfOneDollars <= 1) {
            System.out.println(" " + numberOfOneDollars + " dollar");
        } else if (numberOfOneDollars > 1) {
            System.out.println(" " + numberOfOneDollars + " dollars");
        }
        if (numberOfDimes > 0 && numberOfDimes <= 1) {
            System.out.println(" " + numberOfDimes + "dime");
        } else if (numberOfDimes > 1) {
            System.out.println(" " + numberOfDimes + "dimes");
        }
        if (numberOfNickels > 0 && numberOfNickels <= 1) {
            System.out.println(" " + numberOfNickels + "nickel");
        } else if (numberOfNickels > 1) {
            System.out.println(" " + numberOfNickels + "nickels");
        }
        if (numberOfPennies > 0 && numberOfPennies <= 1) {
            System.out.println(" " + numberOfPennies + "penny");
        } else if (numberOfPennies > 1) {
            System.out.println(" " + numberOfPennies + "pennies");
        }
    }
}
