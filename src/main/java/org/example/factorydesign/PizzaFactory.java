package org.example.factorydesign;

public class PizzaFactory implements ManufacturingUnit{
    @Override
    public Dish createDish() {
        return new Biryani();
    }
}
