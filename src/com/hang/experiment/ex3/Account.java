package com.hang.experiment.ex3;

import java.util.Date;

public class Account {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterest());
        System.out.println("This account was created at " + account.getDateCreated());
    }

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate / 100;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double draw) {
        if (this.balance > draw) {
            this.balance -= draw;
        } else {
            System.out.println("Sorry, your credit is running low");
        }
    }

    public void deposit(double money) {
        this.balance += money;
    }
}
