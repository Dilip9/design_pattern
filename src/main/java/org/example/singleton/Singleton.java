package org.example.singleton;

public class Singleton {

    public static void main(String[] args) {
        SingletonDesign singleton = SingletonDesign.getInstance();
        System.out.println(singleton);
    }
}
