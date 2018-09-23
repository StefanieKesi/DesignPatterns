package factoryPattern.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Car bmw = new BMWFactory().createCar();
        Car byd = new BYDFactory().createCar();

        bmw.driveCar();
        byd.driveCar();
    }
}
