package io.iamofoe.OOP.strategy_design.covid_example.breath;

public class PoorBreathing implements Breathing{
    @Override
    public void breathingSymptoms() {
        System.out.println("Extreme breathing issues. Need for gas mask asap.");
    }
}
