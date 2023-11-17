package sr.bitdynamics.designpattern.factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("im a rectangle");
    }
}
