package com.jchen.creational.singleton;

//线程安全的懒汉单例模式
public class SingletonDemo4 {

    private static SingletonDemo4 INSTANCE;

    private SingletonDemo4(){}

    public static synchronized SingletonDemo4 getInstance(){
        if(null == INSTANCE){
            INSTANCE = new SingletonDemo4();
        }
        return INSTANCE;
    }
}
