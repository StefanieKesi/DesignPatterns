package singletonPattern;

/**
 * 饿汉式
 * 优点：不存在线程安全问题，基于classloader机制，类加载对象就加载
 * 缺点：类初始化就加载对象，没有延时加载的优点，浪费内存，容易产生垃圾对象
 *
 * 个人理解，因为式饿汉，饿了，等不及用的时候才生成对象实例，而是对象加载就要生成
 */
public class Hungry {

    private static Hungry instance = new Hungry(); // 类初始化时立即加载

    private Hungry(){}

    public static Hungry getInstance(){
        return instance;
    }
}
