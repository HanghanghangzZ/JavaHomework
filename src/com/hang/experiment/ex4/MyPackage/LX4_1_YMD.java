package com.hang.experiment.ex4.MyPackage;

import java.util.*; //引用java.util 包

public class LX4_1_YMD {

    public static void main(String[] args) {
    }

    private int year, month, day;

    public LX4_1_YMD(int y, int m, int d) {
        year = y;
        month = (((m >= 1) & (m <= 12)) ? m : 1);
        day = (((d >= 1) & (d <= 31)) ? d : 1);
    }

    public LX4_1_YMD() {
        this(0, 0, 0);
    }

    public static int thisYear() {
        return Calendar.getInstance().get(Calendar.YEAR);//返回当年的年份
    }

    public int year() {
        return year;//返回年份
    }

    public String toString() {
        return year + "-" + month + "-" + day;//返回转化为字符串的年-月-日
    }
}
