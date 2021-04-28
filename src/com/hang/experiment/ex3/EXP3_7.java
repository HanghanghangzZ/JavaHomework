package com.hang.experiment.ex3;

public class EXP3_7 {
    protected String xm; //具有保护修饰符的成员变量
    protected int xh;

    //设置数据的方法
    void setData(String m, int h) {
        xm = m;
        xh = h;
    }

    //输出数据的方法
    public void print() {
        System.out.println(xm + ", " + xh);
    }
}

