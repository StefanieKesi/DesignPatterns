package dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {

    public static void main(String[] args){
        Marry marrier = new Marrier();

        MarrierHandler marrierHandler = new MarrierHandler(marrier);

        Marry marry = (Marry) Proxy.newProxyInstance(DynamicProxyMain.class.getClassLoader(),Marrier.class.getInterfaces(),marrierHandler);

        marry.marry();

        marry.sayLove();
    }
}
