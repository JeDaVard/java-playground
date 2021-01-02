package com.company;

class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("t1_%d; ", i);
        }
        System.out.println("\nTask 1: Done!\n");
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 1000; i <= 2000; i++) {
            System.out.printf("t2_%d; ", i);
        }
        System.out.println("\nTask 2: Done!\n");
    }
}

class Task3 extends Thread {
    public void run() {
        for (int i = 2000; i <= 3000; i++) {
            System.out.printf("t3_%d; ", i);
        }
        System.out.println("\nTask 3: Done!\n");
    }
}

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student("Dav\n");
        System.out.println(s.getName());

        Task1 t1 = new Task1();
        Thread thread1 = new Thread(t1);
        System.out.println("\nTask 1: Start!\n");
        thread1.start();

        Task2 t2 = new Task2();
        System.out.println("\nTask 2: Start!\n");
        t2.start();

        Task3 t3 = new Task3();
        System.out.println("\nTask 3: Start!\n");
        thread1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(1);
        t3.start();

        t3.join();

        System.out.println("\nAll run\n");
    }
}
