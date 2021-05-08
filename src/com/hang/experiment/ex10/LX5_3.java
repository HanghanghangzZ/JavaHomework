package com.hang.experiment.ex10;

public class LX5_3 {
    public static void main(String[] args) throws java.io.IOException {
        byte buffer[] = new byte[10];
        System.out.println("从键盘输入不超过10 个字符，按回车键结束输入：");
        int count = System.in.read(buffer);         //读取输入的字符并存放在缓冲区buffer 中
        System.out.println("保存在缓冲区buffer 中元素的个数为：" + count);
        System.out.println("buffer 中各元素的值为：");
        for (int i = 0; i < count; i++) {
            System.out.print(" " + buffer[i]);      //在屏幕上显示buffer 元素的值
        }
        System.out.println();
        System.out.println("输出buffer 字符元素：");
        System.out.write(buffer, 0, buffer.length);
    }

}
