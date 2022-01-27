package io.iamofoe.OOP.strategy_design.duck_example.fly;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}
