package singletonPattern;

/**
 *
 */
public class MainDemo {

    public static void main(String[] args){

        EnumSingle enumSingle = EnumSingle.INSTANCE;

        enumSingle.setName("Stefanie Kesi");

        System.out.println(enumSingle.getName());

        EnumSingle enumSingle1 = EnumSingle.INSTANCE;

        enumSingle1.setName("Stefanie Sun");

        System.out.println(enumSingle.getName());

        System.out.println(enumSingle1.getName());




    }
}
