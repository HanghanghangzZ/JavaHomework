package com.hang;

public class Test2 {
    public static void main(String[] args) {
        A a1 = new B();
        A a2 = new D();
        a1.print();
        a2.print();

        /* com.hang.A cannot be cast to com.hang.B */
//        B b = (B) new A();
//        b.print();
    }
}

class A {
    int i;
    void print() {
        System.out.println("A");
    }

    protected void test() {
        System.out.println("protected");
    }

    private void test1() {
        System.out.println("private");
    }

    void test2() {
        System.out.println("default");
    }
}

class B extends A {
    @Override
    void print() {
        System.out.println("B");
    }

    @Override
    public void test() {
        super.test();
    }

    @Override
    public void test2() {
        super.test2();
    }
}

class C extends A {
    @Override
    void print() {
        System.out.println("C");
    }
}

class D extends B {
    @Override
    void print() {
        System.out.println("D");
    }
}

class E extends C {
    @Override
    void print() {
        System.out.println("E");
    }
}