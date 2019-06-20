package com.jchen.structural.adapter.classadapter;

public class ConcreteTarget implements Target{
    public void request() {
        System.out.println("This is concrete target request");
    }
}
