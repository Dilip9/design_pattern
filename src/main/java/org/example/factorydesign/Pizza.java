package org.example.factorydesign;

public class Pizza implements Dish{

    @Override
    public void prepare() {
        System.out.println(" Pizza is getting prepared...");
    }

    @Override
    public void serve() {
        System.out.println(" Getting ready to serve...");
    }
}
