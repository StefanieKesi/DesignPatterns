package factoryPattern.abstractFactory;

public class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("不可以按摩");
    }
}
