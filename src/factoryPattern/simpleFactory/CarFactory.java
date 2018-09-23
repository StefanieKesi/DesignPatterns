package factoryPattern.simpleFactory;

/**
 * 静态工厂方法，就是工厂类一般是静态方法，通过接受参数的不同来创建不同的实例
 *
 * 缺点，对于增加新的产品无能为力，如果不修改代码的话，是无法扩展的。
 */
public class CarFactory {
    public static Car createCar(String type) {
        if ("BYD".equalsIgnoreCase(type)) {
            return new BYD();
        } else if ("BMW".equalsIgnoreCase(type)) {
            return new BMW();
        } else {
            return null;
        }
    }
}
