package com.hang.experiment.ex2;

public class EXP2_2 {
    static int i = 10;

    public static void main(String args[]) {
        {
            int k = 10;
            System.out.println("i=" + i);
            System.out.println("k=" + k);
        }
        System.out.println("i=" + i);
//        System.out.println("k=" + k);//编译时将出错，已出k的使用范围
    }

}
