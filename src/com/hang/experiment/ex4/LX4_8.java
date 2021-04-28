package com.hang.experiment.ex4;

public class LX4_8 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("\na = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("发生了被 0 除：" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界：" + e);
        }
    }

}
