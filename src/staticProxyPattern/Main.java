package staticProxyPattern;

/**
 * 静态代理
 * 1.真实角色（Stefanie Sun）
 * 2.代理角色（孙燕姿的经纪人）
 * 3.真实角色和代理角色实现同一个接口（Singer）
 * 4.代理角色持有真是角色的引用（通过代理角色的构造方法可以把真是角色的引用创建起来）
 */
public class Main {
    public static void main(String[] args) {
        Singer singer = new RealSinger();
        SingerProxy singerProxy = new SingerProxy(singer);
        singerProxy.discussBusiness();
        singerProxy.signContract();
        singerProxy.sing();
    }
}
