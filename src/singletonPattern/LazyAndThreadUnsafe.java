package singletonPattern;

/**
 * 懒汉式
 *
 * 不加synchronized锁，线程不安全
 *
 */
public class LazyAndThreadUnsafe {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static LazyAndThreadUnsafe instance;

    private LazyAndThreadUnsafe(){}

    public static LazyAndThreadUnsafe getInstance(){
        if(instance==null){
            instance = new LazyAndThreadUnsafe();
        }
        return instance;
    }

}
