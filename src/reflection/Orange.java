package reflection;

public class Orange implements Fruit{

    public Orange() {
        System.out.println("Orange");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating an orange...");
    }
}
