package com.jchen.structural.decorator.v1;

public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getDesc() {
        return super.getDesc()+ " with egg";
    }

    @Override
    protected int cost() {
        return super.cost() +1;
    }
}
