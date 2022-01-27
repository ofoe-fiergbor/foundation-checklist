package io.iamofoe.OOP.strategy_design.covid_example.breath;

public class NormalBreathing implements Breathing{
    @Override
    public void breathingSymptoms() {
        System.out.println("<<Breathing is normal... Nothing out of the ordinary.>>");
    }
}
