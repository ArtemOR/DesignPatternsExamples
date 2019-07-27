package main.patterns.strategy.client;


import main.patterns.strategy.model.Duck;
import main.patterns.strategy.model.fly.*;
import main.patterns.strategy.model.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I’m a model duck");
    }
}