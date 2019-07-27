package main.patterns.strategy.client;

import main.patterns.strategy.model.Duck;
import main.patterns.strategy.model.fly.FlyWithWings;
import main.patterns.strategy.model.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
