package io.iamofoe.OOP.strategy_design.duck_example.ducks;

import io.iamofoe.OOP.strategy_design.duck_example.fly.FlyBehaviour;
import io.iamofoe.OOP.strategy_design.duck_example.quack.QuackBehaviour;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void displayDuck();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }


    public void swim() {
        System.out.println("Swimming happily.");
    }
}
