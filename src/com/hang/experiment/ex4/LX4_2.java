package com.hang.experiment.ex4;

import com.hang.experiment.ex4.MyPackage.LX4_1_YMD;

public class LX4_2 {
    private String name;
    private LX4_1_YMD birth;

    public static void main(String args[]) {
        LX4_2 a = new LX4_2("朱瑞杭", 2001, 1, 11);
        a.output();
    }

    public LX4_2(String n1, LX4_1_YMD d1) {
        name = n1;
        birth = d1;
    }

    public LX4_2(String n1, int y, int m, int d) {
        this(n1, new LX4_1_YMD(y, m, d));//初始化变量与对象
    }

    public int age() //计算年龄
    {
        return LX4_1_YMD.thisYear() - birth.year(); //返回当前年与出生年的差即年龄
    }

    public void output() {
        System.out.println("姓名 : " + name);
        System.out.println("出生日期: " + birth.toString());
        System.out.println("今年年龄 : " + age());
    }
}

