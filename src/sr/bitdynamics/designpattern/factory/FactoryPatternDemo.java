package sr.bitdynamics.designpattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("circle");
        s1.draw();
    }
}
