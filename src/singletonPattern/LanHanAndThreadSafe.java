package singletonPattern;

/**
 * 懒汉式
 *
 * 优点：延时加载，对象在用的时候才会加载
 * 缺点：线程安全，加了synchronized锁，影响效率,每次调用getInstance方法的时候都必须获得getInstance的锁，而实际上，当单例实例被创建以后，其后的请求没有必要再使用互斥机制了
 *
 * 个人理解，懒，在调用时才会新建对象，节省内存空间
 */
public class LanHanAndThreadSafe {

    private static LanHanAndThreadSafe instance;

    private LanHanAndThreadSafe(){}

    /**
     * class锁机制，每次只有一个线程可以调用getInstance()方法
     *
     */
    public static synchronized LanHanAndThreadSafe getInstance(){
        if (instance == null){
            instance = new LanHanAndThreadSafe();
        }
        return instance;
    }
}
