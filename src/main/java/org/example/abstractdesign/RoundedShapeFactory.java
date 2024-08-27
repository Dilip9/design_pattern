package org.example.abstractdesign;

public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundRectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }return null;
    }
}
