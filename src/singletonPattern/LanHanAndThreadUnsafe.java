package singletonPattern;

/**
 * 懒汉式
 *
 * 不加synchronized锁，线程不安全
 *
 */
public class LanHanAndThreadUnsafe {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static LanHanAndThreadUnsafe instance;

    private LanHanAndThreadUnsafe(){}

    public static LanHanAndThreadUnsafe getInstance(){
        if(instance==null){
            instance = new LanHanAndThreadUnsafe();
        }
        return instance;
    }

}
