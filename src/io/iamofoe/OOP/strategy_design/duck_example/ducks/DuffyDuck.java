package io.iamofoe.OOP.strategy_design.duck_example.ducks;

import io.iamofoe.OOP.strategy_design.duck_example.fly.NoFly;
import io.iamofoe.OOP.strategy_design.duck_example.quack.LoudQuack;

public class DuffyDuck extends Duck{

    public DuffyDuck() {
        flyBehaviour = new NoFly();
        quackBehaviour = new LoudQuack();
    }

    @Override
    public void displayDuck() {
        System.out.println("You know me, I'm a duffy duck");
    }
}
