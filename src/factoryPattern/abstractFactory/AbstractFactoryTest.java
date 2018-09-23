package factoryPattern.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        Seat seat = carFactory.createSeat();
        Tyre tyre = carFactory.createTyre();
        engine.start();
        engine.run();
        seat.massage();
        tyre.revolve();
        CarFactory carFactory1 = new LowCarFactory();
        Engine engine1 = carFactory1.createEngine();
        Seat seat1 = carFactory1.createSeat();
        Tyre tyre1 = carFactory1.createTyre();
        engine1.start();
        engine1.run();
        seat1.massage();
        tyre1.revolve();
    }
}
