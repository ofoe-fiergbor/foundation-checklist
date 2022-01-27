package io.iamofoe.OOP.strategy_design.covid_example.headache;

public class LightHeadache implements Headache {
    @Override
    public void headacheSymptom() {
        System.out.println("Light headaches.");
    }
}
