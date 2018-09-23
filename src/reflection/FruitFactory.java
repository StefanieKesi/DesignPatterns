package reflection;

public class FruitFactory {

    public static Fruit createFruit(String fruitName) {
        Fruit fruit = null;
        if ("Apple".equalsIgnoreCase(fruitName)) {
            fruit = new Apple();
        }
        if ("Banana".equalsIgnoreCase(fruitName)) {
            fruit = new Banana();
        }
        return fruit;
    }
}
