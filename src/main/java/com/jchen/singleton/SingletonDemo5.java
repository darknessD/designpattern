package com.jchen.singleton;

//线程安全的且效率更高的懒汉单例模式
public class SingletonDemo5 {

    private static SingletonDemo5 INSTANCE;

    private SingletonDemo5(){}

    public static SingletonDemo5 getInstance(){
        if(null == INSTANCE){
            synchronized (SingletonDemo5.class){
                if(null == INSTANCE){
                    INSTANCE = new SingletonDemo5();
                }
            }
        }
        return INSTANCE;
    }
}
