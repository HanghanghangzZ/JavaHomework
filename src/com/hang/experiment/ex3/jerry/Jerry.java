package com.hang.experiment.ex3.jerry;

import com.hang.experiment.ex3.father.Father;

public class Jerry extends Father {
    public Jerry() {
        super(20);
    }

    public static void main(String args[]) {
        Jerry jerry = new Jerry();
//        jerry.height=12;  //是default的权限，在其它的包下的子孙类无法访问
        jerry.weight = 200;
        jerry.money = 800;
        int m = jerry.getMoney();
//        jerry.setMoney(300);  //是default的权限，在其它的包下的子孙类无法访问
        System.out.println("m=" + m);
    }
}
