package io.iamofoe.OOP.strategy_design.covid_example.covid_19;

import io.iamofoe.OOP.strategy_design.covid_example.breath.Breathing;
import io.iamofoe.OOP.strategy_design.covid_example.cold.Cold;
import io.iamofoe.OOP.strategy_design.covid_example.headache.Headache;

public abstract class Covid {
    protected Headache headache;
    protected Cold cold;
    protected Breathing breathing;

    public abstract void display();

    public void showHeadacheSymptom() {
        headache.headacheSymptom();
    }
    public void showColdSymptom() {
        cold.coldSymptom();
    }
    public void showBreathingSymptom() {
        breathing.breathingSymptoms();
    }

}
