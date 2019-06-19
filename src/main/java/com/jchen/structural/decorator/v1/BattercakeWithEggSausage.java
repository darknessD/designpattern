package com.jchen.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " with Saysage";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
