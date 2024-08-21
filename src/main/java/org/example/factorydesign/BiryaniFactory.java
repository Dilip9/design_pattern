package org.example.factorydesign;

public class BiryaniFactory implements ManufacturingUnit{
    @Override
    public Dish createDish() {
        return new Biryani();
    }
}
