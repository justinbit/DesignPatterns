package sr.bitdynamics.designpattern.factory;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("beef burger");
    }
}
