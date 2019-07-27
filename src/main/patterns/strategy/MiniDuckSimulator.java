package main.patterns.strategy;

import main.patterns.strategy.client.ModelDuck;
import main.patterns.strategy.model.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performQuack();
        mallard.performFly();


    }
}