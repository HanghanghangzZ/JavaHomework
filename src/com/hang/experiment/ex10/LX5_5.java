package com.hang.experiment.ex10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LX5_5 {
    public static void main(String args[]) {
        String str[] = {"First line\n", "Second line\n", "Last line\n"};
        try {
            RandomAccessFile rf = new RandomAccessFile("LX5_5.txt", "rw");
            System.out.println("文件指针位置为：" + rf.getFilePointer());
            System.out.println("文件的长度为：" + rf.length());
            rf.seek(rf.length());
            System.out.println("文件指针现在的位置为：" + rf.getFilePointer());
            for (int i = 0; i < 3; i++) {
                rf.write(str[i].getBytes()); // 字符串转为字节串添加到文件末尾
            }
            rf.seek(0);
            System.out.println("\n 选择显示的文件内容：");
            int len = 0;
            byte[] buffer = new byte[(int) rf.length()];
            while ((len = rf.read(buffer)) != -1) {
                System.out.println(new String(buffer));
            }
            rf.close();
        } catch (FileNotFoundException fileNotFoundException) {
        } catch (IOException ioException) {
        }
    }

}
