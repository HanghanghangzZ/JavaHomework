package com.hang.experiment.ex3;

import java.applet.Applet;
import java.awt.*;

public class E_import extends Applet {
    Button redbutton;

    public void init() {
        redbutton = new Button("这是个红色按钮");
        redbutton.setBackground(Color.red);
        add(redbutton);
    }

    public void paint(Graphics g) {
        g.drawString("this is a button", 30, 50);
    }

}
