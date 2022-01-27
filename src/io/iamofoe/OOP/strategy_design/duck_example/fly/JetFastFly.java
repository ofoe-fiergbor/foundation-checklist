package io.iamofoe.OOP.strategy_design.duck_example.fly;

public class JetFastFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck can fly fast.");
    }
}
