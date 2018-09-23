package singletonPattern.crackSingleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 反射机制和反序列化都可以破解单例模式
 */
public class CrackHungry implements Serializable{

    private static CrackHungry instance = new CrackHungry();

    private CrackHungry() {
        // 防止通过反射机制调用构造方法，使得对象不唯一
        if (instance != null){
            throw new RuntimeException();
        }
    }

    public static CrackHungry getInstance() {
        return instance;
    }

    /**
     * 实现此方法，就会比秒反序列化重新生成对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }
}
