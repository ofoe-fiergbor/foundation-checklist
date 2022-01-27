package io.iamofoe.OOP.strategy_design.covid_example;

import io.iamofoe.OOP.strategy_design.covid_example.covid_19.Covid;
import io.iamofoe.OOP.strategy_design.covid_example.covid_19.Omicron;

public class Execution {
    public static void main(String[] args) {
        Covid omicronPatient = new Omicron();
        omicronPatient.display();
        omicronPatient.showHeadacheSymptom();
        omicronPatient.showBreathingSymptom();
    }
}
