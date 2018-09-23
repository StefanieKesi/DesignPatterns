package reflection;

public class ReflectFruitFactory {

    public static Fruit createFruit(String className) throws Exception{
        Fruit fruit = null;
        fruit = (Fruit)Class.forName(className).newInstance();
        return fruit;
    }

}
