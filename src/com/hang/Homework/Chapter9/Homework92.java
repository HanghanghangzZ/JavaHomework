package com.hang.Homework.Chapter9;

public class Homework92 {

    static class Stock {
        private String symbol;
        private String name;
        private double previousClosingPrice;
        private double currentPrice;

        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public double getChangePercent() {
            return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice;
        }

        public void setPreviousClosingPrice(double previousClosingPrice) {
            this.previousClosingPrice = previousClosingPrice;
        }

        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }
    }

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);

        System.out.println(stock.getChangePercent() * 100 + "%");
    }
}
