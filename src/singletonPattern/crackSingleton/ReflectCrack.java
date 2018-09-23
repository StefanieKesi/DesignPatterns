package singletonPattern.crackSingleton;

import java.lang.reflect.Constructor;

/**
 * 通过反射机制可以跳过构造方法权限的检查，实际上是直接调用构造方法来实例化对象，因此可以出现不同的实例
 *
 * 为了避免这个问题，可以在单例类的构造方法中做出判断，如果不为空，那么抛出RuntimeException异常。
 */
public class ReflectCrack {
    public static void main(String[] args) throws Exception {
        Class<CrackHungry> clazz = (Class<CrackHungry>) Class.forName("singletonPattern.crackSingleton.CrackHungry");
        Constructor<CrackHungry> constructor = clazz.getDeclaredConstructor();
        // 跳过构造方法属性的检查，否则无法调用
        constructor.setAccessible(true);
        CrackHungry crackHungry1 = constructor.newInstance();
        CrackHungry crackHungry2 = constructor.newInstance();
        System.out.println(crackHungry1);
        System.out.println(crackHungry2);
    }
}
