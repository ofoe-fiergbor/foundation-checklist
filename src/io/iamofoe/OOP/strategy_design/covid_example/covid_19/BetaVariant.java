package io.iamofoe.OOP.strategy_design.covid_example.covid_19;

import io.iamofoe.OOP.strategy_design.covid_example.breath.NormalBreathing;
import io.iamofoe.OOP.strategy_design.covid_example.cold.RunnyNose;
import io.iamofoe.OOP.strategy_design.covid_example.headache.LightHeadache;
import io.iamofoe.OOP.strategy_design.covid_example.headache.NoHeadache;

public class BetaVariant extends Covid {
    public BetaVariant() {
        headache = new LightHeadache();
        cold = new RunnyNose();
        breathing = new NormalBreathing();
    }

    @Override
    public void display() {
        System.out.println("<<--Beta variant-->>");
    }
}
