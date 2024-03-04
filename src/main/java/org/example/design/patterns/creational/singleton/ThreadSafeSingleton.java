package org.example.design.patterns.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){
        if (instance == null){
            System.out.println("value :" + ThreadSafeSingleton.class.hashCode());
            synchronized (ThreadSafeSingleton.class){
                if (instance == null){
                 instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
