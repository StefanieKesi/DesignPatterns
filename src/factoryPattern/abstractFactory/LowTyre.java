package factoryPattern.abstractFactory;

public class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("旋转磨损");
    }
}
