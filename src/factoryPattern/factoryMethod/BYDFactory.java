package factoryPattern.factoryMethod;

public class BYDFactory implements CarFactoey {
    @Override
    public Car createCar() {
        return new BYD();
    }
}
