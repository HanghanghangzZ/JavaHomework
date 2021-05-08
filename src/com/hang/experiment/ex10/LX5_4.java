package com.hang.experiment.ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LX5_4 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("LX5_1.HTML");   //建立文件输入流
        BufferedReader bin = new BufferedReader(in);            //建立缓冲输入流
        FileWriter out = new FileWriter(" LX5_1.txt", true);//建立文件输出流
        String str;
        while ((str = bin.readLine()) != null) {                //将缓冲区内容通过循环方式逐行赋值给字符串str
            System.out.println(str);            //在屏幕上显示字符串str
            out.write(str + "\n");          //将字符串str 通过输出流写入LX5_1.txt 中
        }
        in.close();
        out.close();
    }

}
