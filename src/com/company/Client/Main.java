package com.company.Client;

import com.company.Cwresterler.StoneCold;
import com.company.Cwresterler.kane;
import com.company.Cwresterler.wresterler;

public class Main {
    public static void main(String[] args){
        wresterler wresterler1 = new kane();
        wresterler wresterler2 = new StoneCold();

        wresterler1.themeMusic();
        wresterler1.finisher();
        wresterler1.paymentForWork(3);

        wresterler2.themeMusic();
        wresterler2.finisher();
        wresterler2.paymentForWork(5);
        }

}
