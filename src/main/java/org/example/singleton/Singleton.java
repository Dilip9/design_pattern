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
        System.out.println("First Instance :"+tripleton+ " Print Object "+tripleton.toString());
        System.out.println("Second Instance :"+tripleton2+ " Print Object "+tripleton2.toString());
        System.out.println("Third Instance :"+tripleton3+ " Print Object "+tripleton3.toString());
        System.out.println("Instance 4 which need to use existing 1st "+tripleton4+" Print Object "+tripleton4.toString());
        System.out.println("Instance 5 should use existing instance 2nd :"+tripleton5+" Print Object "+tripleton5.toString());
        System.out.println("Instance 6::: Make use of exisintg... 3rd "+tripleton6+" Print Object "+tripleton6.toString());



    }
}
