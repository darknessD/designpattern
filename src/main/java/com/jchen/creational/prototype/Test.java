package com.jchen.creational.prototype;

public class Test {
    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setSubject("Welcome");
        mail.setContent("Hello World");
        Mail mailClone = null;
        try {
            mailClone = (Mail) mail.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(mail);
        System.out.println(mailClone);
    }
}
