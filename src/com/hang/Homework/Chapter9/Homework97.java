package com.hang.Homework.Chapter9;

import java.util.Date;

public class Homework97 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withDraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterestRate());
        System.out.println(account.getDateCreated());
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
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

    public void withDraw(double draw) {
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