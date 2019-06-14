package com.jchen.singleton;

//使用静态代码块初始化的饿汉单例
public class SingletonDemo2 {

    private static final SingletonDemo2 INSTANCE;

    static {
        INSTANCE = new SingletonDemo2();
    }

    private SingletonDemo2(){};

    public static SingletonDemo2 getInstance(){
        return INSTANCE;
    }
}
