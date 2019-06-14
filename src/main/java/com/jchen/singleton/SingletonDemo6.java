package com.jchen.singleton;

//使用静态内部类的单例模式
public class SingletonDemo6 {

    private SingletonDemo6(){}

    private static class SingletonInstanceHolder{
        private final static SingletonDemo6 INSTANCE = new SingletonDemo6();
    }

    public static SingletonDemo6 getInstance(){
        return SingletonInstanceHolder.INSTANCE;
    }
}
