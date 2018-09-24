package dynamicProxyPattern;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Singer singer = new RealSinger();
        SingerHandler singerHandler = new SingerHandler(singer);
        Singer proxy = (Singer) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Singer.class}, singerHandler);
        proxy.sing();
    }
}
