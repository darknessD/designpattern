package com.jchen.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " Price: " + battercake.cost());

        Battercake battercakeEgg = new BattercakeWithEgg();
        System.out.println(battercakeEgg.getDesc() + " Price: " + battercakeEgg.cost());
    }
}
