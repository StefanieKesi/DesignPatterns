package factoryPattern.abstractFactory;

public class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("可以自动按摩！！！");
    }
}
