package dynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SingerHandler implements InvocationHandler {
    private Singer singer;

    public SingerHandler(Singer singer) {
        super();
        this.singer = singer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**************");
        if(method.getName().equalsIgnoreCase("sing")){
            method.invoke(singer,args);
        }
        System.out.println("**************");
        return null;
    }
}
