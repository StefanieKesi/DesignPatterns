package factoryPattern.simpleFactory;

public class BMW implements Car {
    @Override
    public void driveCar() {
        System.out.println("drive a BMW car!");
    }
}
