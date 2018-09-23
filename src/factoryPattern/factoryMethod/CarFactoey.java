package factoryPattern.factoryMethod;

/**
 * 为了避免简单工厂模式的缺点——不完全满足OCP原则，产生了工厂方法模式，他们的不同之处在于，简单工厂模式只有一个工厂类，
 * 而工厂方法模式有一组实现了相同接口的工厂类。
 */
public interface CarFactoey {
    Car createCar();
}
