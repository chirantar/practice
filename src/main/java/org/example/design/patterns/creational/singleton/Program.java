package org.example.design.patterns.creational.singleton;

public class Program {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        // Creating two threads that attempt to get instances of the Singleton
//        Thread thread1 = new Thread(() -> {
//            Singleton singleton = Singleton.getInstance();
//            System.out.println("Thread 1: " + singleton.hashCode());
//        });
//
//        Thread thread2 = new Thread(() -> {
//            Singleton singleton = Singleton.getInstance();
//            System.out.println("Thread 2: " + singleton.hashCode());
//        });
//
//        // Start the threads
//        thread1.start();
//        thread2.start();

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

    }
}
