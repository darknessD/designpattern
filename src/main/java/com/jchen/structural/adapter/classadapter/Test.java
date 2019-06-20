package com.jchen.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target concreTar = new ConcreteTarget();
        concreTar.request();

        Target adapteeTarget = new Adapter();
        adapteeTarget.request();
    }
}
