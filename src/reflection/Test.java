package reflection;

public class Test {

    public static void main(String[] args) throws Exception{
//        Fruit fruit = FruitFactory.createFruit("apple");
//        fruit.eat();
        Fruit fruit = ReflectFruitFactory.createFruit("reflection.Orange");
        fruit.eat();
    }
}
