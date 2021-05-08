package com.hang.experiment.ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_1 {
    public static void main(String args[]) throws IOException {
        int inum;
        double dnum;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input an integer:");
        str = buf.readLine();
        inum = Integer.parseInt(str);

        System.out.print("Input an floating point number:");
        str = buf.readLine();
        dnum = Float.parseFloat(str);

        System.out.print("Input an string:");
        str = buf.readLine();
        System.out.println("Input integer:" + inum);
        System.out.println("Input floating point nubmer:" + dnum);
        System.out.println("Input string:" + str);
    }
}