package com.hang.Homework.Chapter11;

import java.util.ArrayList;
import java.util.Date;

public class Homework118 {
    public static void main(String[] args) {
        NewAccount george = new NewAccount("George", 1122, 1000);
        george.setAnnualInterestRate(1.5);

        george.deposit(30);
        george.deposit(40);
        george.deposit(50);

        george.withDraw(5);
        george.withDraw(4);
        george.withDraw(2);

        System.out.println(george);
    }
}

class NewAccount {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public NewAccount() {
    }

    public NewAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public NewAccount(String name, int id, double balance) {
        this.name = name;
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
            Transaction transaction = new Transaction(new Date(), 'W', draw, this.balance, "哈哈哈");
            this.transactions.add(transaction);
        } else {
            System.out.println("Sorry, your credit is running low");
        }
    }

    public void deposit(double money) {
        this.balance += money;
        Transaction transaction = new Transaction(new Date(), 'D', money, this.balance, "哈哈哈");
        this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("NewAccount{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated);
        for (Transaction transaction : this.transactions) {
            ret.append("\n" + transaction);
        }
        return ret.toString();
    }
}

class Transaction {
    private Date date;
    private char type;

    private double amount;
    private double balance;
    private String description;

    public Transaction(Date date, char type, double amount, double balance, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}