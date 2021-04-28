package com.hang;

public class Test3 {
    public static void main(String[] args) {
        test();
//        try {
//            method();
//            System.out.println("After the method ca11");
//        } catch (RuntimeException ex){
//            System.out.println("RuntimeException in main");
//        } catch(Exception ex){
//            System.out.println("Exception in main");
//        }
    }
    static void method () throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method ()");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }

    public void m(int value) throws Exception {
        if (value < 40) {
            throw new Exception("value is too small");
        }
    }

    public static void test() {
        try {
            System.out.println("1");
            System.out.println(1 / 0);
        } catch (NullPointerException nullPointerException) {
            System.out.println("2");
            throw nullPointerException;
        } finally {
            System.out.println("3");
        }
        System.out.println("4");
    }
}