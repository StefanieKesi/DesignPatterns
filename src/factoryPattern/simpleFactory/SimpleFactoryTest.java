package factoryPattern.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Car byd = CarFactory.createCar("byd");
        Car bmw = CarFactory.createCar("bmw");

        byd.driveCar();
        bmw.driveCar();
    }

}
