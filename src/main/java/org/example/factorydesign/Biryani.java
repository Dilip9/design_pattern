package org.example.factorydesign;

public class Biryani implements Dish{
    @Override
    public void prepare() {
        System.out.println(" Getting ready to eat...");
    }

    @Override
    public void serve() {
        System.out.println(" Decorating into plates ........");

    }
}
