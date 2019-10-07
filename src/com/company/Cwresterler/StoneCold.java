package com.company.Cwresterler;

public class StoneCold implements wresterler {
    @Override
    public void themeMusic() {
        System.out.println("Stone cold's intro Music");

    }

    @Override
    public void finisher() {
        System.out.println("Stone Cold Stunner");
    }

    @Override
    public void paymentForWork(int hours) {
        System.out.println("The wrester will make $" + hours*300 + " for tonight");
    }
}
