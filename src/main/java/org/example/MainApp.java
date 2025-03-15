package org.example;

import org.example.abstractdesign.AbstractShapeFactory;
import org.example.abstractdesign.FactoryProducer;
import org.example.abstractdesign.Shape;
import org.example.factorydesign.BiryaniFactory;
import org.example.factorydesign.Dish;
import org.example.factorydesign.ManufacturingUnit;
import org.example.factorydesign.PizzaFactory;

public class MainApp {
    public static void main(String[] args) {

       /**
        * Factory Design Pattern
        * start
        * **/
        ManufacturingUnit manufacturingUnit = new BiryaniFactory();
        Dish dish = manufacturingUnit.createDish();
        dish.prepare();
        dish.serve();

        ManufacturingUnit manufacturingUnits = new PizzaFactory();
        Dish pizzDish = manufacturingUnits.createDish();
        pizzDish.prepare();
        pizzDish.serve();
        /**
         * Factory Design Pattern ends here...
         * ***/
        /**
         * Abstract Factory Design Pattern start from here...
         *
         * ***/
        //get shape factory
        AbstractShapeFactory shapeFactory = FactoryProducer.getFactory(false);
        //Rectangle Shape...
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();
        //Square Shape...
        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();

        AbstractShapeFactory shapeFactoryWithTrue = FactoryProducer.getFactory(true);
        Shape rectangleShapes = shapeFactoryWithTrue.getShape("RECTANGLE");
        rectangleShapes.draw();
        Shape squareShapes = shapeFactoryWithTrue.getShape("SQUARE");
        squareShapes.draw();
    }
}