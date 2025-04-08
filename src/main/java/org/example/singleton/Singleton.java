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
        System.out.println("Instance 4 which need to use existing "+tripleton4);
        System.out.println("Instance 5 should use existing instance :"+tripleton5);
        System.out.println("Instance 6::: Make use of exisintg..."+tripleton6);



    }
}
