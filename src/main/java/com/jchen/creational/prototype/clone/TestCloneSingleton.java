package com.jchen.creational.prototype.clone;

public class TestCloneSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonObj singletonObj = SingletonObj.getInstance();
        System.out.println(singletonObj);
        SingletonObj singletonObj1 = (SingletonObj) singletonObj.clone();
        System.out.println(singletonObj1);
    }
}
