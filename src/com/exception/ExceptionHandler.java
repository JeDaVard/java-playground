package com.exception;

public class ExceptionHandler {
    public static void main(String[] args) {
        method1();
        System.out.println("Main: ended");
    }

    private static void method1() {
        try {
            method2();
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
        System.out.println("Meth 1: ended");
    }

    private static void method2() {
        String str = null;
        str.length();
        System.out.println("Meth 2: ended");
    }
}
