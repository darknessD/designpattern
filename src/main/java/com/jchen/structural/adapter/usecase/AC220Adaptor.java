package com.jchen.structural.adapter.usecase;

public class AC220Adaptor implements DC5 {

    private AC220 ac220 = new AC220();

    public int outElectric5V() {
        int inputElec = ac220.outElectric220V();
        System.out.println("Make the 220v to 5V");
        int outPutElec = inputElec/44;
        return outPutElec;
    }
}
