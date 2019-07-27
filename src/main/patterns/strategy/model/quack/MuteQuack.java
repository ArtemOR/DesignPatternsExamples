package main.patterns.strategy.model.quack;

public class MuteQuack implements IQuackBehavior {

    public void quack() {
        System.out.println("Bzzz");
    }

}
