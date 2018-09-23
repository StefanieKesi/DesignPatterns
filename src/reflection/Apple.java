package reflection;

public class Apple implements Fruit {

    public Apple() {
        System.out.println("Apple");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating an apple...");
    }
}
