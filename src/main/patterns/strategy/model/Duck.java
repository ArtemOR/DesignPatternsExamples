package main.patterns.strategy.model;

import main.patterns.strategy.model.quack.IQuackBehavior;
import main.patterns.strategy.model.fly.IFlyBehavior;

public abstract class Duck {
    public IFlyBehavior flyBehavior;
    public IQuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        this.quackBehavior = qb;
    }


}
