package com.hang.experiment.ex3;

public class EXP3_12 {
    public static void main(String[] args) {
        RunDemo runDemo = new RunDemo();
        RunDemo runDemo1 = new RunDemo("张三");
        RunDemo runDemo2 = new RunDemo(null, "李四");
        RunDemo runDemo3 = new RunDemo("王五", "12345678");
    }
}

class RunDemo {
    private String userName, password;

    RunDemo() {
        System.out.println("全部为空!");
    }

    RunDemo(String name) {
        userName = name;
    }

    RunDemo(String name, String pwd) {
        this(name);
        password = pwd;
        check();
    }

    void check() {
        String s = null;
        if (userName != null)
            s = "用户名：" + userName;
        else
            s = "用户名不能为空！";
        if (password != "12345678")
            s = s + " 口令无效！";
        else
            s = s + " 口令：********";
        System.out.println(s);
    }
}

