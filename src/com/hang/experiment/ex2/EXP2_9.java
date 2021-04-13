package com.hang.experiment.ex2;

public class EXP2_9 {
    public static void main(String[] args) {
        int h, c;
        System.out.println("摄氏温度\t华氏温度");
        for (c = 0; c <= 40; c += 5) {
            h = c * 9 / 5 + 32; //如不是本题的特殊情况，应将h,c都改为double，将9改为9.0
            System.out.println("\t" + c + "\t" + h);
        }
    }
}
