package strategy.duck;

public class Quack implements QuackBehavior, QuackSound {
    public void quack() {
        System.out.println("Quack");
    }
}