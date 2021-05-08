package com.hang.experiment.ex10;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex10_4 {
    public static void main(String args[]) {
        try {
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            byte data[] = new byte[1024];
            RandomAccessFile raf1 = new RandomAccessFile(file1, "r");
            RandomAccessFile raf2 = new RandomAccessFile(file2, "rw");
            raf1.read(data);
            raf2.seek(raf2.length());
            raf2.write(data);
            raf1.close();
            raf2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
