package factoryPattern.abstractFactory;

public class LowEngine implements Engine {
    @Override
    public void run() {
        System.out.println("低端发动机转速慢");
    }

    @Override
    public void start() {
        System.out.println("低端发动机启动慢");
    }
}
