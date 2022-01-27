package io.iamofoe.OOP.strategy_design.covid_example.cold;

public class NoCold implements Cold{
    @Override
    public void coldSymptom() {
        System.out.println("No signs of cold.");
    }
}
