package factoryPattern.simpleFactory;

public class CarFactory1 {

    public static Car createBYD(){
        return new BYD();
    }

    public static Car createBMW(){
        return new BMW();
    }
}
