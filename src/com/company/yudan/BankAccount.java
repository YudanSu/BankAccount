package com.company.yudan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccount extends Measurable {
    private float balance;
    private float rate; // design the data member in the class.


    public BankAccount(float balance, float rate) {  // constructor.
        this.balance = balance;
        this.rate = rate;
    }

    @Override
    public float getMeasurable() {
        return this.balance;
    }

    public BankAccount() {
        this.balance = 0;
        this.rate = 0.1f;
    }

    public float processYear() {
        float interest = this.balance * this.rate;
        this.balance = this.balance + interest;
        return this.balance;

    }

    public float processNYears(int n) {
        int i = 0;
        while (i < n) {
            processYear();
            i = i + 1;
        }
        return this.balance;
    }


    public static void main(String[] args){
        BankAccount account = new BankAccount(1000, 1);
        BankAccount account1 = new BankAccount(2000, 2);
        BankAccount account2 = new BankAccount(500, 1);

        System.out.println(account.compareTo(account1));

        List<Measurable> list = new ArrayList<>();
        list.add(account);
        list.add(account1);
        list.add(account2);

        Collections.sort(list);
        System.out.println(Measurable.average(list));


    }

}


