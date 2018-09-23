package reflection;

public class Banana implements Fruit {

    public Banana() {
        System.out.println("banabn");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating a banana...");
    }
}
