package com.jchen.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("Piggy", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.setBirthday(new Date(666666666666L));
        //下面这种情况必须使用深克隆，就是里面的引用对象也要被克隆
        //pig1.getBirthday().setTime(666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
