package io.iamofoe.OOP.strategy_design.covid_example.cold;

public class RunnyNose implements Cold{
    @Override
    public void coldSymptom() {
        System.out.println("Runny nose symptom");
    }
}
