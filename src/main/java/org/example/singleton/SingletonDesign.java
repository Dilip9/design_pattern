package org.example.singleton;

public class SingletonDesign {
    public static final SingletonDesign INSTANCE = new SingletonDesign();

    public synchronized SingletonDesign getInstance() {
        return INSTANCE;
    }

}
