package org.example.singleton;

public class Singleton {

    public static void main(String[] args) {
        //SingletonDesign singleton = SingletonDesign.getInstance();
        //System.out.println(singleton);
        Tripleton tripleton = Tripleton.getInstance();
        Tripleton tripleton2 = Tripleton.getInstance();
        Tripleton tripleton3 = Tripleton.getInstance();
        Tripleton tripleton4 = Tripleton.getInstance();
        Tripleton tripleton5 = Tripleton.getInstance();
        Tripleton tripleton6 = Tripleton.getInstance();
        System.out.println(tripleton);
        System.out.println(tripleton2);
        System.out.println(tripleton3);
        System.out.println("Instance 4 which need to be reuse"+tripleton4);
        System.out.println(""+tripleton5);
        System.out.println(tripleton6);



    }
}
