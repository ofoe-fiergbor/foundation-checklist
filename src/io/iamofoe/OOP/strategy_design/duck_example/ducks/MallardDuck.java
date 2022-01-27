package io.iamofoe.OOP.strategy_design.duck_example.ducks;


import io.iamofoe.OOP.strategy_design.duck_example.fly.JetFastFly;
import io.iamofoe.OOP.strategy_design.duck_example.quack.QuietDuck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new JetFastFly();
        quackBehaviour = new QuietDuck();
    }

    @Override
    public void displayDuck() {
        System.out.println("Hey, I'm a yellow mallard duck.");
    }
}
