package com.jchen.creational.singleton;

//饿汉单例
public class SingletonDemo1 {

    private static final SingletonDemo1 INSTANCE = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance(){
        return INSTANCE;
    }
}
