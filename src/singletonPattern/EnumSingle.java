package singletonPattern;

/**
 * 优点：实现简单，线程安全，避免通过反射和反序列化的漏洞
 *
 * 缺点：不能实现延时加载
 */
public enum EnumSingle {

    /* 定义一个枚举的元素，它就代表一个实例 */
    INSTANCE;

    /**
     * 添加自己需要的方法
     */
    public void whateverMethod(){}

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
