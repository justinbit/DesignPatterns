package sr.bitdynamics.designpattern.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape s1 = shapeFactory.getShape("SQUARE");
        s1.draw();
    }
}
