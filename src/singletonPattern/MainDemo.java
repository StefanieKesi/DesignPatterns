package singletonPattern;

/**
 *
 */
public class MainDemo {

    public static void main(String[] args){

        Hungry hungry = Hungry.getInstance();
        LazyAndThreadUnsafe lazyAndThreadUnsafe = LazyAndThreadUnsafe.getInstance();
        LazyAndThreadSafe lazyAndThreadSafe = LazyAndThreadSafe.getInstance();
        DoubleCheckedLocking doubleCheckedLocking = DoubleCheckedLocking.getInstance();
        StaticInternalClass staticInternalClass = StaticInternalClass.getInstance();
        EnumSingle enumSingle = EnumSingle.INSTANCE;

    }
}
