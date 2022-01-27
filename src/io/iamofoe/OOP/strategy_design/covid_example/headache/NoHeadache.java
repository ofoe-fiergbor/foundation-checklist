package io.iamofoe.OOP.strategy_design.covid_example.headache;

public class NoHeadache implements Headache{
    @Override
    public void headacheSymptom() {
        System.out.println("No form of headache detected.");
    }
}
