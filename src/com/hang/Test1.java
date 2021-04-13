package com.hang;

public class Test1 {
    public static void main(String[] args) {
        a a = new a(1);
        System.out.println(a.getA());
    }
}

class a {
    private final int a;

    public a(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
