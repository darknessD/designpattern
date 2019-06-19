package com.jchen.structural.decorator.v2;

public class BattercakeDecorator implements IBattercake {

    private IBattercake iBattercake;

    public BattercakeDecorator(IBattercake iBattercake) {
        this.iBattercake = iBattercake;
    }

    public String getDesc() {
        return iBattercake.getDesc();
    }

    public int getCost() {
        return iBattercake.getCost();
    }
}
