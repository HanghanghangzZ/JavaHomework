package com.hang.experiment.ex10;

import java.io.*;

public class LX5_6 {
    public static void main(String arg[]) {
        try { //添加方式创建文件输出流
            FileOutputStream fout = new FileOutputStream("LX5_6.txt", true);
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(1);
            dout.writeChars("罗马" + "\n");
            dout.writeInt(2);
            dout.writeChars("北京" + "\n");
            dout.close();
        } catch (IOException ioe) {
        }
        try {
            FileInputStream fin = new FileInputStream("LX5_6.txt");
            DataInputStream din = new DataInputStream(fin);
            int i = din.readInt();
            while (i != -1) {
                //输入流未结束时，输入流结束时i 为-1
                System.out.print(i + " ");
                char ch;
                while ((ch = din.readChar()) != '\n') //字符串未结束时
                    System.out.print(ch);
                System.out.println();
                i = din.readInt();
            }
            din.close();
        } catch (IOException ioe) {
        }
    }
}
