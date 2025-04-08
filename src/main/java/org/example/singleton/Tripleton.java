package org.example.singleton;

public class Tripleton {
    private static final int MAX_INSTANCES = 3;
    private static final Tripleton[] instances = new Tripleton[MAX_INSTANCES];
    private static int index =0;

    private Tripleton() {
        // Private constructor to prevent instantiation
    }

    static{
        for (int i = 0; i < MAX_INSTANCES; i++) {
            instances[i] = new Tripleton();
        }
    }

    public static Tripleton getInstance(){
        Tripleton instance = instances[index];
        System.out.println("Returning instance number:  " + index);
        index = (index + 1) % MAX_INSTANCES;
        return instance;
    }
//    public String toString() {
//        return "Tripleton instance " + index;
//    }
}
