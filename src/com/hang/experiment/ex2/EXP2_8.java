package com.hang.experiment.ex2;

public class EXP2_8 {
    public static void main(String[] args) {
        int c = 38;
        switch (c < 10 ? 1 : c < 25 ? 2 : c < 35 ? 3 : 4) {
            case 1:
                System.out.println(" " + c + "℃ 有点冷。要多穿衣服。");
            case 2:
                System.out.println(" " + c + "℃ 正合适。出去玩吧。");
            case 3:
                System.out.println(" " + c + "℃ 有点热。");
            default:
                System.out.println(" " + c + "℃ 太热了!开空调。");
        }
    }
}
