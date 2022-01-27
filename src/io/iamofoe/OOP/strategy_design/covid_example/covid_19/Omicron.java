package io.iamofoe.OOP.strategy_design.covid_example.covid_19;

import io.iamofoe.OOP.strategy_design.covid_example.breath.NormalBreathing;
import io.iamofoe.OOP.strategy_design.covid_example.cold.RunnyNose;
import io.iamofoe.OOP.strategy_design.covid_example.headache.NoHeadache;

public class Omicron extends Covid{
    public Omicron() {
        headache = new NoHeadache();
        cold = new RunnyNose();
        breathing = new NormalBreathing();
    }

    @Override
    public void display() {
        System.out.println("<<--Omicron variant-->>");
    }
}
