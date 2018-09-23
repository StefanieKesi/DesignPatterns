package singletonPattern.crackSingleton;

import java.io.*;

/**
 * 反序列化时会重新生成新的对象，达到破解单例模式的作用
 */
public class SerializableCrack {

    public static void main(String[] args) throws Exception {
        CrackHungry crackHungry1 = CrackHungry.getInstance();

        FileOutputStream fos = new FileOutputStream("D:/serializable.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(crackHungry1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D:/serializable.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        CrackHungry crackHungry2 = (CrackHungry) ois.readObject();
        System.out.println(crackHungry1);
        System.out.println(crackHungry2);
    }

}
