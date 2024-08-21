package org.example;

import org.example.factorydesign.BiryaniFactory;
import org.example.factorydesign.Dish;
import org.example.factorydesign.ManufacturingUnit;
import org.example.factorydesign.PizzaFactory;

public class MainApp {
    public static void main(String[] args) {
        ManufacturingUnit manufacturingUnit = new BiryaniFactory();
        Dish dish = manufacturingUnit.createDish();
        dish.prepare();
        dish.serve();

        ManufacturingUnit manufacturingUnits = new PizzaFactory();
        Dish pizzDish = manufacturingUnits.createDish();
        pizzDish.prepare();
        pizzDish.serve();


    }
}