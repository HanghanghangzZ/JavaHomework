package com.hang.Homework.Chapter6;

import java.util.Scanner;

public class Homework67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The amount invested:");
        double investmentAmount = scanner.nextDouble();
        System.out.println("Annual interest rate");
        double monthlyInterestRate = scanner.nextDouble() / 100 / 12;
        scanner.close();

        futureInvestmentValue(investmentAmount, monthlyInterestRate, 30);
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = 0;
        System.out.println("Years" + "\t\t" + "Future Value");
        for (int i = 1; i <= years; i++) {
            futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, i * 12);
            System.out.println(i + "\t\t" + futureValue);
        }
        return futureValue;
    }
}
