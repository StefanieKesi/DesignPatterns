package staticProxyPattern;

/**
 * 真实角色
 */
public class Marrier implements Marry {

    @Override
    public void marry() {
        System.out.println("我要结婚了");
    }
}
