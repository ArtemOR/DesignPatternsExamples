package main.patterns.strategy.model.fly;

public class FlyNoWay implements IFlyBehavior {

    public void fly(){
        System.out.println("Not fly");
    }

}
