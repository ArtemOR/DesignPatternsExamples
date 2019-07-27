package main.patterns.strategy.model.quack;

public class Squeak implements IQuackBehavior {

    public void quack() {
        System.out.println("Squeak");
    }

}
