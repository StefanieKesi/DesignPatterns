package factoryPattern.abstractFactory;

public class LuxuryEngine implements Engine{
    @Override
    public void run() {
        System.out.println("好发动机转的快！！！");
    }

    @Override
    public void start() {
        System.out.println("好发动机启动快，可以自动启停！！！");
    }
}
