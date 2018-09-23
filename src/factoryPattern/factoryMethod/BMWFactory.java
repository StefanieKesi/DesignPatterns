package factoryPattern.factoryMethod;

public class BMWFactory implements CarFactoey {
    @Override
    public Car createCar() {
        return new BMW();
    }
}
