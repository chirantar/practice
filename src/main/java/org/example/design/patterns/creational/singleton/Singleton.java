package org.example.design.patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
