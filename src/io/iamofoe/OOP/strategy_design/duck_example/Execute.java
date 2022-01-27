package io.iamofoe.OOP.strategy_design.duck_example;

import io.iamofoe.OOP.strategy_design.duck_example.ducks.Duck;
import io.iamofoe.OOP.strategy_design.duck_example.ducks.DuffyDuck;
import io.iamofoe.OOP.strategy_design.duck_example.ducks.MallardDuck;
import io.iamofoe.OOP.strategy_design.duck_example.fly.JetFastFly;
import io.iamofoe.OOP.strategy_design.duck_example.quack.QuietDuck;

public class Execute {
    public static void main(String[] args) {
        Duck randomMallard = new MallardDuck();
        randomMallard.performFly();
        randomMallard.performQuack();

        Duck loudDuffyDuck = new DuffyDuck();
        loudDuffyDuck.performQuack();
        loudDuffyDuck.performFly();

        System.out.println("=======================================");
        loudDuffyDuck.setFlyBehaviour(new JetFastFly());
        loudDuffyDuck.setQuackBehaviour(new QuietDuck());
        loudDuffyDuck.performFly();
    }
}
