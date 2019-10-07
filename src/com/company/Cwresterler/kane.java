package com.company.Cwresterler;

public class kane implements wresterler {
    @Override
    public void themeMusic() {
        System.out.println("Kane's Intro Music");

    }

    @Override
    public void finisher() {
        System.out.println("TombStone");
    }

    public void paymentForWork(int hours) {
        System.out.println("The wrester will make $" + hours*400 + " for tonight");
    }
}
