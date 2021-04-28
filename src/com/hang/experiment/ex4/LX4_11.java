package com.hang.experiment.ex4;

public class LX4_11 {
    static void mathodA() {
        try {
            System.out.println("\nmathodA 抛出一个异常");
            throw new RuntimeException();
        } finally {
            System.out.println("执行 mathodA 的 finally");
        }
    }

    static void mathodB() {
        try {
            System.out.println("mathodB 正常返回");
            return;
        } finally {
            System.out.println("执行 mathodB 的 finally");
        }
    }

    public static void main(String args[]) {
        try {
            mathodA();
        } catch (Exception e) {
            mathodB();
        }
    }
}
