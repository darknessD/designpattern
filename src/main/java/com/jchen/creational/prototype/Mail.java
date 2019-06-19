package com.jchen.creational.prototype;

public class Mail implements Cloneable{
    private String subject;
    private String receiver;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constractor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clone Mail object");
        return super.clone();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "subject='" + subject + '\'' +
                ", receiver='" + receiver + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
