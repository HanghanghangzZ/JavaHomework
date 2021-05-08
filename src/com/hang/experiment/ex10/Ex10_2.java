package com.hang.experiment.ex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10_2 {
    public static void main(String args[]) throws IOException {
        FileInputStream fi = new FileInputStream("C:\\Users\\杭杭\\Desktop\\学习\\大二\\Java面向对象\\实验报告\\实验十\\test.txt");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\杭杭\\Desktop\\学习\\大二\\Java面向对象\\实验报告\\实验十\\testCopy.txt");
        System.out.println("file size=" + fi.available());
        byte data[] = new byte[fi.available()];
        fi.read(data);
        fo.write(data);
        System.out.println("file copyed and renamed");
        fi.close();
        fo.close();
    }
}
