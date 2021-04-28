package com.hang;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.fahterMethod();
        child.interfaceTest();

        Father father = child;
        father.fahterMethod();
    }
}

class Child extends Father implements interTest {
    private int a;

    public void fahterMethod() {
        System.out.println("This is Child Method");
    }

    public Child() {
    }

    public Child(int a) {
        this.a = a;
    }

    @Override
    public void interfaceTest() {
        System.out.println("This is interfaceTest");
    }

    @Override
    public void test() {
        super.test();
    }

    public void test(int a) {

    }
}

class Father {
    private int a = 1;

    public void fahterMethod() {
        System.out.println("This is Father Method");
    }

    /* 静态方法不能不重写 */
    public static void staticTest() {
        System.out.printf("This is Father static method");
    }

    public void test() {
        System.out.println("This is Father Method");
    }
}

interface interTest {
    void interfaceTest();
}