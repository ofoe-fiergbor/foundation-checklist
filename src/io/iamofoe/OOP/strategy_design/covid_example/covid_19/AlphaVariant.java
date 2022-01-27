package io.iamofoe.OOP.strategy_design.covid_example.covid_19;

import io.iamofoe.OOP.strategy_design.covid_example.breath.PoorBreathing;
import io.iamofoe.OOP.strategy_design.covid_example.cold.RunnyNose;
import io.iamofoe.OOP.strategy_design.covid_example.headache.ExtremeHeadache;

public class AlphaVariant extends Covid {
    public AlphaVariant() {
        cold = new RunnyNose();
        headache = new ExtremeHeadache();
        breathing = new PoorBreathing();
    }

    @Override
    public void display() {
        System.out.println("<<--Alpha variant-->>");
    }
}
