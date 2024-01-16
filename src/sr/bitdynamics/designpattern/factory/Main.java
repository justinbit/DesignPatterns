package sr.bitdynamics.designpattern.factory;

public class Main {
    public static void main(String[] args) {
        Restaurant reqbeef = new BeefBurgerRestaurant();
        Burger beef = reqbeef.orderBurger();
    }
}
