package sr.bitdynamics.designpattern.factory;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("veggie burger");
    }
}
