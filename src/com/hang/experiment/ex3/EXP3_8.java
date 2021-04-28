package com.hang.experiment.ex3;

public class EXP3_8 extends EXP3_7 {
    protected String dx;
    protected String xy;
    protected String xi;

    public static void main(String args[]) {
        EXP3_7 p1 = new EXP3_7();
        p1.setData("李四", 12321);
        p1.print();
        EXP3_8 s1 = new EXP3_8();
        s1.setData("张三", 12345); //调用父类的成员方法
        s1.dx = "浙江科技大学"; //访问本类的成员变量
        s1.xy = "信息与电子工程学院"; //访问本类的成员变量
        s1.xi = "计算机系"; //访问本类的成员变量
        s1.print();
        System.out.print(s1.xm + ", " + s1.dx + ", " + s1.xy + ", " + s1.xi);
    }
}
