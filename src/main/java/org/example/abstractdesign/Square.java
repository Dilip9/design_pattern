package org.example.abstractdesign;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square :: draw() method is called...");
    }
}
