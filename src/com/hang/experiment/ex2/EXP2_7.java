package com.hang.experiment.ex2;

public class EXP2_7 {
    public static void main(String[] args) {
        int year = 2005;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) // 方法1
            System.out.println(year + " 年是闰年");
        else
            System.out.println(year + " 年不是闰年");
    }
}
