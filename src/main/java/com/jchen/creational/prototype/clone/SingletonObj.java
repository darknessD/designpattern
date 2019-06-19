package com.jchen.creational.prototype.clone;

public class SingletonObj implements Cloneable {
    private static final SingletonObj INSTANCE= new SingletonObj();

    private SingletonObj() {}

    public static SingletonObj getInstance(){
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
