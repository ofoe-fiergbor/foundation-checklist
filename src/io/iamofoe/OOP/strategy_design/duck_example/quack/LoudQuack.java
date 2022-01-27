package io.iamofoe.OOP.strategy_design.duck_example.quack;

public class LoudQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Very loud duck.");
    }
}
