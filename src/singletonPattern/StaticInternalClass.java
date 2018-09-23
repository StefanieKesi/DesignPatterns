package singletonPattern;

/**
 * 静态内部类模式
 *
 * 优点：集成了延时加载和线程安全的优点，在高并发下，线程安全，效率高。
 */
public class StaticInternalClass {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static class StaticInternalClassHolder {
        private static final StaticInternalClass INSTANCE = new StaticInternalClass();
    }

    private StaticInternalClass() {
    }

    public static final StaticInternalClass getInstance() {
        return StaticInternalClassHolder.INSTANCE;
    }
}
