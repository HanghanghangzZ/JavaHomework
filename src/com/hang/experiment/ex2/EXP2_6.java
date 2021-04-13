package com.hang.experiment.ex2;

public class EXP2_6 {
    public static void main(String[] args) {
        int k, i = 3, j = 4;
        k = i + j;
        System.out.println("在复合块外的输出 k=" + k);
        {
            float f;
            f = j + 4.5F;
            i++;
            System.out.println("在复合块内的输出 f=" + f);
            System.out.println("在复合块内的输出 k=" + k);
        }
        System.out.println("在复合块外的输出 i=" + i);
    }
}
