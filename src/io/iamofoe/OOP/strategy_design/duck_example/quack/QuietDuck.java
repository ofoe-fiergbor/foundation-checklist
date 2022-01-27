package io.iamofoe.OOP.strategy_design.duck_example.quack;

public class QuietDuck implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Very quiet duck.");
    }
}
