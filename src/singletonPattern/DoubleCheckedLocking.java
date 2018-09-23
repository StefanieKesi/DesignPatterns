package singletonPattern;

/**
 * 优点：双锁机制，安全，而且在多线程下能够保持高性能
 *
 * 缺点：由于JVM底层内部模型原因，偶尔会出问题，不建议使用
 */
public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking instance;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if (instance == null){
            // 即使两个线程都判断为空，这个时候，加入synchronized锁机制，
            // 保证只有一个方法能使用class文件，当第一个线程已经创建了
            // DoubleCheckedLocking对象，第二个线程就不会进第二个if判断了
            synchronized (DoubleCheckedLocking.class){
                if (instance == null){
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}