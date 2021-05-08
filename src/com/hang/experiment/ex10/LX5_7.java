package com.hang.experiment.ex10;

import java.io.*;

public class LX5_7 implements Serializable {
    int bh = 1;
    int nl = 21;
    String xm;

    LX5_7(int bh, String xm, int nl)//构造方法
    {
        this.bh = bh;
        this.xm = xm;
        this.nl = nl;
    }

    LX5_7()//构造方法
    {
        this(0, "", 21);
    }

    void save(String fname)//保存到文件中的方法
    {
        try {
            FileOutputStream fout = new FileOutputStream(fname);//输出文件流
            ObjectOutputStream out = new ObjectOutputStream(fout);//输出对象流
            out.writeObject(this); //写入对象
            out.close();
        } catch (FileNotFoundException fe) {
        } catch (IOException ioe) {
        }
    }

    void display(String fname)//显示文件中对象信息的方法
    {
        try {
            FileInputStream fin = new FileInputStream(fname);//输入文件流
            ObjectInputStream in = new ObjectInputStream(fin);//输入对象流
            LX5_7 OO = (LX5_7) in.readObject(); //读取对象
            System.out.println(" 类名： " + OO.getClass().getName() + " " +
                    OO.getClass().getInterfaces()[0]);
            System.out.println(" " + OO.bh + " " + OO.xm + " " + OO.nl);
            in.close();
        } catch (FileNotFoundException fe) {
        } catch (IOException ioe) {
        } catch (ClassNotFoundException ioe) {
        }
    }

    public static void main(String arg[]) {
        String fname = "LX5_7.obj";
        LX5_7 O1 = new LX5_7(1, "张驰", 14);
        O1.save(fname);
        O1.display(fname);
    }

}
