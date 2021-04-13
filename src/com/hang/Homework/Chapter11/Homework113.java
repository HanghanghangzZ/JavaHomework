package com.hang.Homework.Chapter11;

import java.util.Date;

public class Homework113 {
    public static void main(String[] args) {
        Account account = new Account(1, 2000);
        account.setAnnualInterestRate(1);
        SavingAccount savingAccount = new SavingAccount(1, 2000);
        CheckingAccount checkingAccount = new CheckingAccount(1, 2000,2000);
        checkingAccount.setAnnualInterestRate(1);

        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());
    }
}

class CheckingAccount extends Account {
    private double overdraftQuota;

    public double getOverdraftQuota() {
        return overdraftQuota;
    }

    public CheckingAccount(double overdraftQuota) {
        this.overdraftQuota = overdraftQuota;
    }

    public CheckingAccount(int id, double balance, double overdraftQuota) {
        super(id, balance);
        this.overdraftQuota = overdraftQuota;
    }

    @Override
    public void setAnnualInterestRate(double annualInterestRate) {
        super.setAnnualInterestRate(annualInterestRate);
    }

    @Override
    public void withDraw(double draw) {
        double balance = super.getBalance();
        if (balance > draw) {
            super.setBalance(balance - draw);
        } else if (balance + this.overdraftQuota > draw) {
            this.overdraftQuota -= draw - balance;
            super.setBalance(0);
        } else {
            System.out.println("Sorry, your credit is running low");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "CheckingAccount{" +
                "overdraftQuota=" + overdraftQuota +
                '}';
    }
}

class SavingAccount extends Account {
    public SavingAccount(int id, double balance) {
        super(id, balance);
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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
