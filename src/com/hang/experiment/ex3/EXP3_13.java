package com.hang.experiment.ex3;

public class EXP3_13 implements NL {
    String xm; //类自己的成员变量（姓名）
    int csrq; //类自己的成员变量（出生日期）

    public EXP3_13(String n1, int y) { //类构造方法
        xm = n1;
        csrq = y;
    }

    @Override
    public int age() { //实现接口的方法
        return year - csrq; //这里直接使用了接口中的常量year
    }

    @Override
    public void output() { //实现接口的方法
        System.out.println(this.xm + "今年的年龄是" + this.age() + "岁");
    }

    public static void main(String args[]) //类自己的成员方法
    {
        NL a = new EXP3_13("张三", 1994);
        a.output();
    }

}

interface NL { //定义接口
    int year = 2021;

    int age();

    void output();
}

