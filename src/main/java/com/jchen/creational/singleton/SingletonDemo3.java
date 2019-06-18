package com.jchen.creational.singleton;

//线程不安全的懒汉单例模式
public class SingletonDemo3 {

    private static SingletonDemo3 INSTANCE;

    private SingletonDemo3(){}

    public static SingletonDemo3 getInstance(){
        if(null == INSTANCE){
            INSTANCE = new SingletonDemo3();
        }
        return INSTANCE;
    }
}
