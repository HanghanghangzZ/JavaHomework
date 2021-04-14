package com.hang.experiment.ex3;

public class EXP3_5 {
    public static void main(String[] args) {
        int x = 10, y = 10;
        ff1(x, y);
        System.out.println("x=" + x + ", y=" + y);
    }

    static void ff1(int passX, int passY) {
        passX = passX * passX;
        passY = passY * passY;
        System.out.println("passX=" + passX + ", passY=" + passY);
    }

}
