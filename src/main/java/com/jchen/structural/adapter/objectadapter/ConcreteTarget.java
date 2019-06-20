package com.jchen.structural.adapter.objectadapter;

public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("This is concrete target request");
    }
}
