package staticProxyPattern;

/**
 * 1.创建真实角色
 * 2.创建代理角色+真实角色的引用
 * 3.代理执行真实角色方法
 */
public class StaticProxyMain {

    public static void main(String[] args){

        Marrier marrier = new Marrier();
        WeddingProxy weddingProxy = new WeddingProxy(marrier);
        weddingProxy.marry();
    }
}
