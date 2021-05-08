package com.hang.experiment.ex10;

import java.io.FileReader;
import java.io.IOException;

public class Ex10_3 {
    public static void main(String args[]) throws IOException {
        char data[] = new char[1024];
        FileReader fr = new FileReader("story.txt");
        int num = fr.read(data);
        String str = new String(data, 0, num);
        System.out.println("Character read= " + num);
        System.out.println(str);
        fr.close();
    }
}
